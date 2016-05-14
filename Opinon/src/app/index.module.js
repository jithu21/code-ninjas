(function ()
{
    'use strict';

    /**
     * Main module of the Fuse
     */
    angular
        .module('fuse', [

           'Devise',
          // Core
            'app.core',

            // Navigation
            'app.navigation',

            // Toolbar
            'app.toolbar',

            // Quick panel
             'app.login',
            'app.quick-panel',
            'app.dashboards',
            // Sample
            'app.sample',
            'app.s3',
            'scDateTime',
            'app.sourceDetail',
            'underscore',
            'app.user',
             'app.rules',
              'app.objects'

        ]);
})();
