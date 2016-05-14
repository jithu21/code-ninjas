(function ()
{
    'use strict';

    angular
        .module('app.dashboards.server', [])
        .config(config);

    /** @ngInject */
    function config($stateProvider)
    {
        // State
        $stateProvider.state('app.dashboards_server', {
            url      : '/dashboard-server',
            views    : {
                'content@app': {
                    templateUrl: 'app/main/apps/dashboards/server/dashboard-server.html',
                    controller : 'DashboardServerController as vm'
                }
            },
            resolve  : {
                DashboardData: function (apiResolver)
                {
                    return {
                      "widget1": {
                        "title": "Events Dashboard",
                        "chart": [
                          {
                            "key": "Total Events",
                            "values": [
                              {"x": 1, "y": 10000},
                              {"x": 2, "y": 12000},
                              {"x": 3, "y": 10000},
                              {"x": 4, "y": 9000},
                              {"x": 5, "y": 11500},
                              {"x": 6, "y": 12500},
                              {"x": 7, "y": 13000},
                              {"x": 8, "y": 10000},
                              {"x": 9, "y": 12000},
                              {"x": 10, "y": 7000}
                            ]
                          },
                          {
                            "key": "Valid Events",
                            "values": [
                              {"x": 1, "y": 8000},
                              {"x": 2, "y": 9000},
                              {"x": 3, "y": 7000},
                              {"x": 4, "y": 8500},
                              {"x": 5, "y": 10000},
                              {"x": 6, "y": 12000},
                              {"x": 7, "y": 10000},
                              {"x": 8, "y": 9000},
                              {"x": 9, "y": 10000},
                              {"x": 10, "y": 5000}
                            ]
                          },
                          {
                            "key": "Invalid Events",
                            "values": [
                              {"x": 1, "y": 2000},
                              {"x": 2, "y": 3000},
                              {"x": 3, "y": 3000},
                              {"x": 4, "y": 500},
                              {"x": 5, "y": 1500},
                              {"x": 6, "y": 500},
                              {"x": 7, "y": 3000},
                              {"x": 8, "y": 1000},
                              {"x": 9, "y": 2000},
                              {"x": 10, "y": 2000}
                            ]
                          }
                        ]
                      },
                      "widget2": {
                        "title": "Total Events",
                        "value": {
                          "used": "1.2 Million",
                          "total": "",
                          "percentage": 67.45
                        },
                        "detail": "This is the back side. You can show detailed information here."
                      },
                      "widget3": {
                        "title": "Total Valid Events",
                        "value": {
                          "used": "0.8 Million",
                          "total": "",
                          "percentage": 6.31
                        },
                        "detail": "This is the back side. You can show detailed information here."
                      },
                      "widget4": {
                        "title": "Total Invalid Events",
                        "value": "0.4 Million",
                        "footnote": "Higher than average",
                        "detail": "This is the back side. You can show detailed information here.",
                        "chart": [
                          {
                            "key": "Latency",
                            "values": [
                              {"x": 8000, "y": 1}
                            ]
                          }
                        ]
                      },
                      "widget5": {
                        "title": "Today's Events",
                        "value": "10k",
                        "detail": "This is the back side. You can show detailed information here.",
                        "footnote": "Lower than average"
                      },
                      "widget6": {
                        "title": "Average CPU Usage (Live)",
                        "chart": [
                          {
                            "key": "Average CPU Usage",
                            "values": [
                              {"x": 5, "y": 72},
                              {"x": 10, "y": 26},
                              {"x": 15, "y": 51},
                              {"x": 20, "y": 36},
                              {"x": 25, "y": 66},
                              {"x": 30, "y": 69},
                              {"x": 35, "y": 50},
                              {"x": 40, "y": 35},
                              {"x": 45, "y": 49},
                              {"x": 50, "y": 64},
                              {"x": 55, "y": 37},
                              {"x": 60, "y": 78},
                              {"x": 65, "y": 54},
                              {"x": 70, "y": 8},
                              {"x": 75, "y": 52},
                              {"x": 80, "y": 50},
                              {"x": 85, "y": 56},
                              {"x": 90, "y": 71},
                              {"x": 95, "y": 31},
                              {"x": 100, "y": 37},
                              {"x": 105, "y": 15},
                              {"x": 110, "y": 45},
                              {"x": 115, "y": 35},
                              {"x": 120, "y": 28},
                              {"x": 125, "y": 7},
                              {"x": 130, "y": 36},
                              {"x": 135, "y": 7},
                              {"x": 140, "y": 79},
                              {"x": 145, "y": 12},
                              {"x": 150, "y": 5}
                            ]
                          }
                        ]
                      },
                      "widget7": {
                        "title": "Connector History",
                        "table": {
                          "columns": [
                            {
                              "title": "Object"
                            },
                            {
                              "title": "Connector"
                            },
                            {
                              "title": "Status"
                            },
                            {
                              "title": "Time"
                            }
                          ],
                          "rows": [
                            [
                              {
                                "value": "DailyMail",
                                "classes": "text-bold"
                              },
                              {
                                "value": "s3",
                                "classes": "text-boxed m-0 green-bg white-fg"
                              },
                              {"value": "completed"},
                              {"value": "24 mins"}
                            ],
                            [
                              {
                                "value": "cpdavd",
                                "classes": "text-bold"
                              },
                              {
                                "value": "s3",
                                "classes": "text-boxed m-0 green-bg white-fg"
                              },
                              {"value": "completed"},
                              {"value": "30 mins"}
                            ],
                            [
                              {
                                "value": "cpsrvd",
                                "classes": "text-bold"
                              },
                              {
                                "value": "s3",
                                "classes": "text-boxed m-0 green-bg white-fg"
                              },
                              {"value": "completed"},
                              {"value": "14 mins"}
                            ],
                            [
                              {
                                "value": "crond",
                                "classes": "text-bold"
                              },
                              {
                                "value": "s3",
                                "classes": "text-boxed m-0 green-bg white-fg"
                              },
                              {"value": "completed"},
                              {"value": "12 mins"}
                            ],
                            [
                              {
                                "value": "dnsadmin",
                                "classes": "text-bold"
                              },
                              {
                                "value": "s3",
                                "classes": "text-boxed m-0 green-bg white-fg"
                              },
                              {"value": "completed"},
                              {"value": "4 mins"}
                            ],
                            [
                              {
                                "value": "httpd",
                                "classes": "text-bold"
                              },
                              {
                                "value": "mysql",
                                "classes": "text-boxed m-0 deep-orange-bg white-fg"
                              },
                              {"value": "completed"},
                              {"value": "2 mins"}
                            ]
                          ]
                        }
                      },
                      "widget8": {
                        "title": "Activity",
                        "activities": [
                          {
                            "process" : "Custom Aggregation Succeded - Dec 20",
                            "type": "Output",
                            "value": "100 %"
                          },
                          {
                            "process" : "Aggregation Failed - Dec 17",
                            "type": "Input",
                            "value": "10 %"
                          },
                          {
                            "process" : "Aggregation Failed - Dec 16",
                            "type": "Input",
                            "value": "5 %"
                          },
                          {
                            "process" : "Aggregation Succeded - Dec 16",
                            "type": "Output",
                            "value": "100 %"
                          },
                          {
                            "process" : "Aggregation Succeded - Dec 12",
                            "type": "Output",
                            "value": "100 %"
                          },
                          {
                            "process" : "Aggregation Succeded - Dec 12",
                            "type": "Output",
                            "value": "100 %"
                          }
                        ]
                      }
                    };
                }
            },
            bodyClass: 'dashboard-server'
        });
    }

})();
