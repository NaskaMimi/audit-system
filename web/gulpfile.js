const gulp = require('gulp');
const typescript = require('gulp-typescript');
const tscConfig = require('ю/tsconfig.json');

// TypeScript compile
gulp.task('compile', function () {
    return gulp
        .src('app/**/*.ts')
        .pipe(inlineNg2Template({ base: '/',target:'es5' }))
        .pipe(typescript(tscConfig.compilerOptions))
        .pipe(gulp.dest('dist/app'));
});