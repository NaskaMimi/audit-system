const gulp = require('gulp');
const del = require('del');
const typescript = require('gulp-typescript');
const tscConfig = require('./tsconfig.json');
const concat = require('gulp-concat');
const runSequence = require('run-sequence');
const inlineNg2Template = require('gulp-inline-ng2-template');
const tslint = require('gulp-tslint');
const strip = require('gulp-strip-comments');
const cssmin = require('gulp-cssmin');
const css2js = require("gulp-css2js");
const cssBase64 = require('gulp-css-base64');

const sourcePath = "/bundles/*";


gulp.task('clean', function () {
    return del('../webapp/lib/*');
});

gulp.task('tslint', function() {
    return gulp.src('../webapp/app/**/*.ts')
        .pipe(tslint())
        .pipe(tslint.report('verbose'));
});

// TypeScript compile
gulp.task('compile', function () {
    return gulp
        .src('../webapp/app/**/*.ts')
        .pipe(inlineNg2Template({ base: '/',target:'es5' }))
        .pipe(typescript(tscConfig.compilerOptions))
        .pipe(gulp.dest('dist/app'));
});

gulp.task('strip-css',function(){
    return gulp.src('../webapp/css/**/*.css')
        .pipe(concat('styles.css'))
        .pipe(cssBase64())
        .pipe(cssmin({keepSpecialComments:0}))
        .pipe(css2js({
            prefix: "var cssText = \"",
            suffix: "\";\n"
        }))
        .pipe(gulp.dest('../webapp/css'));
});

// copy dependencies
gulp.task('copy:libs', function() {
    gulp.src('node_modules/@angular/**' + sourcePath).pipe(gulp.dest('../webapp/lib/@angular/'));
    gulp.src('node_modules/angular2-in-memory-web-api' + sourcePath).pipe(gulp.dest('../webapp/lib/angular2-in-memory-web-api/'));
    gulp.src('node_modules/reflect-metadata/temp/Reflect.js').pipe(gulp.dest('../webapp/lib/reflect-metadata'));

    gulp.src([
        'node_modules/bootstrap/dist/**/*.min.css',
        'node_modules/bootstrap/dist/**/*.min.js'
    ]).pipe(gulp.dest('../webapp/lib/bootstrap'));

    return gulp.src([
            'node_modules/core-js/client/shim.min.js',
            'node_modules/zone.js/dist/zone.js',
            'node_modules/systemjs/dist/system.src.js',
            'node_modules/moment/moment.js',
            'node_modules/ng2-bootstrap/bundles/ng2-bootstrap.js'
        ])
        .pipe(gulp.dest('../webapp/lib'))
});

gulp.task('build', function () {
    runSequence('tslint','compile','copy:libs')
});
