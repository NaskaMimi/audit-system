(function(global)
{
    var map =
    {
        'app': 'app',
        '@angular': 'lib/@angular',
        /*  dependency npmcdn from */
        'rxjs': 'https://npmcdn.com/rxjs@5.0.0-beta.6',
        'ts': 'https://npmcdn.com/plugin-typescript@4.0.10/lib/plugin.js',
        'typescript': 'https://npmcdn.com/typescript@1.8.10/lib/typescript.js'
    };

    var packages = {
        'app': { main: 'main.ts',  defaultExtension: 'ts' }
    };

    var ngPackageNames = [
        'common',
        'compiler',
        'core',
        'http',
        'platform-browser',
        'platform-browser-dynamic',
        'router',
        'router-deprecated',
        'upgrade'
    ];

    ngPackageNames.forEach(function(pkgName) {
        map['@angular/'+pkgName] = 'lib/@angular/' + pkgName + '/bundles';
    });

    ngPackageNames.forEach(function(pkgName) {

        packages['@angular/'+pkgName] = { main: pkgName + '.umd.js', defaultExtension: 'js' };
    });

    var config =
    {
        transpiler: 'ts',
        typescriptOptions:
        {
            tsconfig: true
        },
        meta:
        {
            'typescript':
            {
                "exports": "ts"
            }
        },
        map: map,
        packages: packages
    };

    System.config(config);

})(this);