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

gulp.task('tslint', function() {
    return gulp.src('app/**/*.ts')
        .pipe(tslint())
        .pipe(tslint.report('verbose'));
});

// TypeScript compile
gulp.task('compile', function () {
    return gulp
        .src('app/**/*.ts')
        .pipe(inlineNg2Template({ base: '/',target:'es5' }))
        .pipe(typescript(tscConfig.compilerOptions))
        .pipe(gulp.dest('dist/app'));
});

gulp.task('strip-css',function(){
    return gulp.src('css/**/*.css')
        .pipe(concat('styles.css'))
        .pipe(cssBase64())
        .pipe(cssmin({keepSpecialComments:0}))
        .pipe(css2js({
            prefix: "var cssText = \"",
            suffix: "\";\n"
        }))
        .pipe(gulp.dest('dist/js'));
});

// copy dependencies
gulp.task('copy:libs', function() {
    gulp.src('node_modules/@angular/**/*').pipe(gulp.dest('dist/lib/@angular/'));
    gulp.src('node_modules/angular2-in-memory-web-api/**/*').pipe(gulp.dest('dist/lib/angular2-in-memory-web-api/'));
    gulp.src('node_modules/rxjs/**/*').pipe(gulp.dest('dist/lib/rxjs/'));
    return gulp.src([
            'node_modules/core-js/client/shim.min.js',
            'node_modules/zone.js/dist/zone.js',
            'node_modules/systemjs/dist/system.src.js',
            'lib/bootstrap.min.js',
            'node_modules/moment/moment.js',
            'node_modules/ng2-bootstrap/bundles/ng2-bootstrap.js',
            'lib/jquery-2.2.3.min.js',
            'lib/jstree.js'
        ])
        .pipe(gulp.dest('dist/lib'))
});

gulp.task('build', function () {
    runSequence('clean', 'copy:libs');
});
