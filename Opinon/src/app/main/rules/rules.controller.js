(function ()
{
    'use strict';

    angular
        .module('app.rules')
        .controller('RulesController', RulesController);

    /** @ngInject */
    function RulesController()
    {
        var vm = this;

        // Data

        vm.rules = [{ "rulename":"Not greater than 10",
                       "objectname":"Temperature",
                        "source":"FTP", "field":"Temperatue", "createdBy":"Jithendranath Gupta", "createdAt":"2015/12/10"},
          { "rulename":"Not less than 0",
            "objectname":"Temperature",
            "source":"FTP", "field":"Temperatue", "createdBy":"Vivek", "createdAt":"2015/12/11"},
          { "rulename":"Not Equals Rahul",
            "objectname":"Account",
            "source":"s3", "field":"Account Name", "createdBy":"Jithendranath Gupta", "createdAt":"2015/12/13"},
          { "rulename":"Equals Ganesh",
            "objectname":"Account",
            "source":"FTP", "field":"Account Name", "createdBy":"Prasath Venkatraman", "createdAt":"2015/12/14"},
          { "rulename":"Not Equals false",
            "objectname":"Account",
            "source":"FTP", "field":"Sex", "createdBy":"Ramu krupar", "createdAt":"2015/12/15"},
          { "rulename":"Not Greater than 1000",
            "objectname":"Elevation",
            "source":"Others", "field":"Height", "createdBy":"Jithendranath Gupta", "createdAt":"2015/12/16"},
          { "rulename":"Pressure less than 50 ",
            "objectname":"Gas",
            "source":"Others", "field":"Pressure", "createdBy":"Vishal", "createdAt":"2015/12/10"},
          { "rulename":"Matched DNA",
            "objectname":"DNA",
            "source":"FTP", "field":"DNA name", "createdBy":"Jithendranath Gupta", "createdAt":"2015/12/10"},
          { "rulename":"Bids Greater than 10",
            "objectname":"Daily Mail",
            "source":"FTP", "field":"Bid rate", "createdBy":"Gerard", "createdAt":"2015/12/10"},
          { "rulename":"Clear Price greater than 0",
            "objectname":"Daily Mail",
            "source":"Others", "field":"Clear price", "createdBy":"Jithendranath Gupta", "createdAt":"2015/12/14"},
          { "rulename":"Not greater Than 0",
            "objectname":"Temperature",
            "source":"FTP", "field":"Temperatue", "createdBy":"Jithendranath Gupta", "createdAt":"2015/12/10"},
          { "rulename":"Not greater Than 0",
            "objectname":"Temperature",
            "source":"FTP", "field":"Temperatue", "createdBy":"Jithendranath Gupta", "createdAt":"2015/12/10"},
          { "rulename":"Not greater Than 0",
            "objectname":"Temperature",
            "source":"FTP", "field":"Temperatue", "createdBy":"Jithendranath Gupta", "createdAt":"2015/12/10"},
          { "rulename":"Not greater Than 0",
            "objectname":"Temperature",
            "source":"FTP", "field":"Temperatue", "createdBy":"Jithendranath Gupta", "createdAt":"2015/12/10"}
        ];

        vm.dtOptions = {
            dom       : '<"top"f>rt<"bottom"<"left"<"length"l>><"right"<"info"i><"pagination"p>>>',
            pagingType: 'simple',
            autoWidth : false,
            responsive: true
        };

        // Methods

        //////////
    }

})();
