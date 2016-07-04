var gulp = require('gulp');
const del = require('del');
const typescript = require('gulp-typescript');
const concat = require('gulp-concat');
const tscConfig = require('./tsconfig.json');
const runSequence = require('run-sequence');
const inlineNg2Template = require('gulp-inline-ng2-template');
const tslint = require("gulp-tslint");

gulp.task('clean', function () {
    return del('dist/**/*');
});

// TypeScript compile
gulp.task('compile', function () {
    return gulp
        .src('app/**/*.ts')
        .pipe(inlineNg2Template({ base: '/',target:'es5' }))
        .pipe(typescript(tscConfig.compilerOptions))
        .pipe(gulp.dest('dist/'));
});

gulp.task('build-template-cache', ['clean'], function() {

    var ngHtml2Js = require("gulp-ng-html2js"),
        concat = require("gulp-concat");

    return gulp.src("./app/*.html")
        .pipe(ngHtml2Js({
            moduleName: "todoPartials",
            prefix: "/partials/"
        }))
        .pipe(gulp.dest("./dist"));
});

gulp.task('bundle', function() {
    var SystemBuilder = require('systemjs-builder');
    var builder = new SystemBuilder();

    builder.loadConfig('./system.config.js')
        .then(function(){
            var outputFile = '../webapp/js/audit.system.js';
            return builder.buildStatic('dist', outputFile, {
            });
        })
        .then(function(){
            console.log('bundle built successfully!');
        });
});

gulp.task('copy:libs', function() {
    gulp.src('dist/audit.system.js')
        .pipe(gulp.dest('../webapp/client/audit.system.js'));
    gulp.src([
        'node_modules/bootstrap/dist/js/bootstrap.min.js',
        'node_modules/bootstrap/dist/css/bootstrap.min.css',
        'node_modules/bootstrap/dist/css/bootstrap.min.css.map'])
        .pipe(gulp.dest("../webapp/lib/bootstrap"));

    return gulp.src([
            'node_modules/core-js/client/shim.js',
            'node_modules/zone.js/dist/zone.js',
            'node_modules/systemjs/dist/system.src.js',
            'node_modules/reflect-metadata/temp/Reflect.js',
            'node_modules/reflect-metadata/temp/Reflect.js.map',
            'node_modules/systemjs/dist/system.src.js'
        ]).pipe(gulp.dest('../webapp/lib'))
});

gulp.task('watch', function() {
    return gulp.watch(['./index.html','./partials/*.html', './styles/*.*css', './js/**/*.js'], ['build']);
});

gulp.task('build', function () {
    runSequence('clean', 'build-template-cache','compile', 'bundle','copy:libs');
});