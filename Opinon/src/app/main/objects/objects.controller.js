(function ()
{
    'use strict';

    angular
        .module('app.objects')
        .controller('ObjectsController', ObjectsController);

    /** @ngInject */
    function ObjectsController()
    {
        var vm = this;

        // Data
        vm.objects = [{"name":"Bids", "source":"S3", "format":"CSV", "createdBy":"Jithendra", "createdAt":"2015/12/25"},
          {"name":"Temperate", "source":"FTP", "format":"tsv", "createdBy":"Prasath", "createdAt":"2015/12/25"},
          {"name":"Account", "source":"S3", "format":"CSV", "createdBy":"Vivek", "createdAt":"2015/12/25"},
          {"name":"Student", "source":"FTP", "format":"JSON", "createdBy":"Ramesh", "createdAt":"2015/12/25"},
          {"name":"User", "source":"Streaming", "format":"TSV", "createdBy":"Jithendra", "createdAt":"2015/12/25"}
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
