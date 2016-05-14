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
      vm.multiBarHorizontalChart = {
        options: {
          chart: {
            type              : 'multiBarHorizontalChart',
            height            : 450,
            x                 : function (d)
            {
              return d.label;
            },
            y                 : function (d)
            {
              return d.value;
            },
            showControls      : true,
            showValues        : true,
            transitionDuration: 300,
            xAxis             : {
              showMaxMin: false
            },
            yAxis             : {
              tickFormat: function (d)
              {
                return d3.format(',.2f')(d);
              }
            }
          }
        },
        data   : [
          {
            'key'   : 'Active',
            'color' : '#d62728',
            'values': [
              {
                'label': 'Karnataka',
                'value': 60
              },
              {
                'label': 'Assam',
                'value': 65
              },
              {
                'label': 'Delhi',
                'value': 70
              },
              {
                'label': 'Kerala',
                'value': 50
              },
              {
                'label': 'MP',
                'value': 40
              }
            ]
          },
          {
            'key'   : 'In Active',
            'color' : '#1f77b4',
            'values': [
              {
                'label': 'Karnataka',
                'value': 40
              },
              {
                'label': 'Assam',
                'value': 35
              },
              {
                'label': 'Delhi',
                'value': 30
              },
              {
                'label': 'Kerala',
                'value': 50
              },
              {
                'label': 'MP',
                'value': 60
              }
            ]
          }
        ]
      };
        // Methods

        //////////
    }

})();
