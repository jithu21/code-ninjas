(function ()
{
    'use strict';

    angular
        .module('app.dashboards.analytics', [])
        .config(config);

    /** @ngInject */
    function config($stateProvider)
    {
        // State
        $stateProvider.state('app.dashboards_analytics', {
            url      : '/dashboard-analytics',
            views    : {
                'content@app': {
                    templateUrl: 'app/main/apps/dashboards/analytics/dashboard-analytics.html',
                    controller : 'DashboardAnalyticsController as vm'
                }
            },
            resolve  : {
                DashboardData: function (apiResolver)
                {
                    return {
                      "widget1": {
                        "title": "Overview",
                        "onlineUsers": 149,
                        "bigChart": {
                          "chart": [
                            {
                              "key": "Sessions",
                              "values": [
                                {"x": 1, "y": 143},
                                {"x": 2, "y": 155},
                                {"x": 3, "y": 175},
                                {"x": 4, "y": 172},
                                {"x": 5, "y": 165},
                                {"x": 6, "y": 301},
                                {"x": 7, "y": 298},
                                {"x": 8, "y": 302},
                                {"x": 9, "y": 248},
                                {"x": 10, "y": 221},
                                {"x": 11, "y": 190},
                                {"x": 12, "y": 165},
                                {"x": 13, "y": 176},
                                {"x": 14, "y": 189},
                                {"x": 15, "y": 200},
                                {"x": 16, "y": 220},
                                {"x": 17, "y": 205},
                                {"x": 18, "y": 192},
                                {"x": 19, "y": 185},
                                {"x": 20, "y": 142},
                                {"x": 21, "y": 132},
                                {"x": 22, "y": 127},
                                {"x": 23, "y": 122},
                                {"x": 24, "y": 126},
                                {"x": 25, "y": 132},
                                {"x": 26, "y": 120},
                                {"x": 27, "y": 118},
                                {"x": 28, "y": 115},
                                {"x": 29, "y": 110},
                                {"x": 30, "y": 117},
                                {"x": 31, "y": 141},
                                {"x": 32, "y": 159},
                                {"x": 33, "y": 167},
                                {"x": 34, "y": 185},
                                {"x": 35, "y": 184},
                                {"x": 36, "y": 195},
                                {"x": 37, "y": 207},
                                {"x": 38, "y": 230},
                                {"x": 39, "y": 239},
                                {"x": 40, "y": 241},
                                {"x": 41, "y": 239},
                                {"x": 42, "y": 260},
                                {"x": 43, "y": 276},
                                {"x": 44, "y": 258},
                                {"x": 45, "y": 250},
                                {"x": 46, "y": 226},
                                {"x": 47, "y": 227},
                                {"x": 48, "y": 218},
                                {"x": 49, "y": 232},
                                {"x": 50, "y": 253},
                                {"x": 51, "y": 235},
                                {"x": 52, "y": 229},
                                {"x": 53, "y": 225},
                                {"x": 54, "y": 189},
                                {"x": 55, "y": 149},
                                {"x": 56, "y": 131},
                                {"x": 57, "y": 135},
                                {"x": 58, "y": 122},
                                {"x": 59, "y": 97},
                                {"x": 60, "y": 113},
                                {"x": 61, "y": 141},
                                {"x": 62, "y": 142},
                                {"x": 63, "y": 139},
                                {"x": 64, "y": 177},
                                {"x": 65, "y": 194},
                                {"x": 66, "y": 209},
                                {"x": 67, "y": 198},
                                {"x": 68, "y": 222},
                                {"x": 69, "y": 234},
                                {"x": 70, "y": 228},
                                {"x": 71, "y": 248},
                                {"x": 72, "y": 270},
                                {"x": 73, "y": 292},
                                {"x": 74, "y": 265},
                                {"x": 75, "y": 237},
                                {"x": 76, "y": 265},
                                {"x": 77, "y": 248},
                                {"x": 78, "y": 278},
                                {"x": 79, "y": 292},
                                {"x": 80, "y": 300},
                                {"x": 81, "y": 326},
                                {"x": 82, "y": 337},
                                {"x": 83, "y": 339},
                                {"x": 84, "y": 346},
                                {"x": 85, "y": 347},
                                {"x": 86, "y": 342},
                                {"x": 87, "y": 333},
                                {"x": 88, "y": 323},
                                {"x": 89, "y": 295},
                                {"x": 90, "y": 251},
                                {"x": 91, "y": 295},
                                {"x": 92, "y": 294},
                                {"x": 93, "y": 295},
                                {"x": 94, "y": 325},
                                {"x": 95, "y": 340},
                                {"x": 96, "y": 345},
                                {"x": 97, "y": 337},
                                {"x": 98, "y": 318},
                                {"x": 99, "y": 317},
                                {"x": 100, "y": 318},
                                {"x": 101, "y": 332},
                                {"x": 102, "y": 337},
                                {"x": 103, "y": 350},
                                {"x": 104, "y": 349}
                              ]
                            }
                          ]
                        },
                        "sessions": {
                          "title": "Sessions",
                          "value": "14,710",
                          "chart": [
                            {
                              "key": "Sessions",
                              "values": [
                                {"x": 1, "y": 644},
                                {"x": 2, "y": 1310},
                                {"x": 3, "y": 1180},
                                {"x": 4, "y": 750},
                                {"x": 5, "y": 680},
                                {"x": 6, "y": 1141},
                                {"x": 7, "y": 1117},
                                {"x": 8, "y": 1173},
                                {"x": 9, "y": 754},
                                {"x": 10, "y": 678},
                                {"x": 11, "y": 712},
                                {"x": 12, "y": 766},
                                {"x": 13, "y": 812},
                                {"x": 14, "y": 980},
                                {"x": 15, "y": 1120},
                                {"x": 16, "y": 990},
                                {"x": 17, "y": 870},
                                {"x": 18, "y": 610},
                                {"x": 19, "y": 550},
                                {"x": 20, "y": 443}
                              ]
                            }
                          ]
                        },
                        "pageviews": {
                          "title": "Pageviews",
                          "value": "101,961",
                          "chart": [
                            {
                              "key": "Pageviews",
                              "values": [
                                {"x": 1, "y": 1054},
                                {"x": 2, "y": 2048},
                                {"x": 3, "y": 8426},
                                {"x": 4, "y": 6591},
                                {"x": 5, "y": 5425},
                                {"x": 6, "y": 10432},
                                {"x": 7, "y": 9418},
                                {"x": 8, "y": 9590},
                                {"x": 9, "y": 5280},
                                {"x": 10, "y": 4082},
                                {"x": 11, "y": 3633},
                                {"x": 12, "y": 3246},
                                {"x": 13, "y": 5024},
                                {"x": 14, "y": 5295},
                                {"x": 15, "y": 6205},
                                {"x": 16, "y": 5980},
                                {"x": 17, "y": 5103},
                                {"x": 18, "y": 2976},
                                {"x": 19, "y": 2395},
                                {"x": 20, "y": 2599}
                              ]
                            }
                          ]
                        },
                        "pagesSessions": {
                          "title": "Pages / Sessions",
                          "value": "6.93",
                          "chart": [
                            {
                              "key": "Pages / Session",
                              "values": [
                                {"x": 1, "y": 7.64},
                                {"x": 2, "y": 7.56},
                                {"x": 3, "y": 7.14},
                                {"x": 4, "y": 8.79},
                                {"x": 5, "y": 9.15},
                                {"x": 6, "y": 9.14},
                                {"x": 7, "y": 8.43},
                                {"x": 8, "y": 8.18},
                                {"x": 9, "y": 7.00},
                                {"x": 10, "y": 6.79},
                                {"x": 11, "y": 7.93},
                                {"x": 12, "y": 8.92},
                                {"x": 13, "y": 7.60},
                                {"x": 14, "y": 7.37},
                                {"x": 15, "y": 6.84},
                                {"x": 16, "y": 6.60},
                                {"x": 17, "y": 7.90},
                                {"x": 18, "y": 7.07},
                                {"x": 19, "y": 6.67},
                                {"x": 20, "y": 6.05}
                              ]
                            }
                          ]
                        },
                        "avgSessionDuration": {
                          "title": "Avg. Session Duration",
                          "value": "00:03:45",
                          "chart": [
                            {
                              "key": "Avg. Session Duration",
                              "values": [
                                {"x": 1, "y": 192},
                                {"x": 2, "y": 210},
                                {"x": 3, "y": 197},
                                {"x": 4, "y": 240},
                                {"x": 5, "y": 223},
                                {"x": 6, "y": 267},
                                {"x": 7, "y": 230},
                                {"x": 8, "y": 253},
                                {"x": 9, "y": 226},
                                {"x": 10, "y": 222},
                                {"x": 11, "y": 261},
                                {"x": 12, "y": 289},
                                {"x": 13, "y": 297},
                                {"x": 14, "y": 245},
                                {"x": 15, "y": 246},
                                {"x": 16, "y": 275},
                                {"x": 17, "y": 254},
                                {"x": 18, "y": 271},
                                {"x": 19, "y": 223},
                                {"x": 20, "y": 226}
                              ]
                            }
                          ]
                        }
                      },
                      "widget2": {
                        "title": "Visitors",
                        "map": {
                          "center": {
                            "latitude": 48.4061246,
                            "longitude": -30.2047679
                          },
                          "zoom": 3,
                          "options": {
                            "minZoom": 3,
                            "scrollwheel": false
                          },
                          "markers": [
                            {
                              "id": 0,
                              "coords": {
                                "latitude": 47.285454,
                                "longitude": 20.887874
                              },
                              "show": false,
                              "sessions": "Sessions: 13"
                            },
                            {
                              "id": 1,
                              "coords": {
                                "latitude": 52.285454,
                                "longitude": 18.887874
                              },
                              "show": false,
                              "sessions": "Sessions: 24"
                            },
                            {
                              "id": 2,
                              "coords": {
                                "latitude": 41.055373,
                                "longitude": 29.286248
                              },
                              "show": false,
                              "sessions": "Sessions: 17"
                            },
                            {
                              "id": 3,
                              "coords": {
                                "latitude": 33.164624,
                                "longitude": -6.006887
                              },
                              "show": false,
                              "sessions": "Sessions: 6"
                            },
                            {
                              "id": 4,
                              "coords": {
                                "latitude": 53.089197,
                                "longitude": -1.601800
                              },
                              "show": false,
                              "sessions": "Sessions: 14"
                            },
                            {
                              "id": 5,
                              "coords": {
                                "latitude": 55.207897,
                                "longitude": 36.470735
                              },
                              "show": false,
                              "sessions": "Sessions: 6"
                            },
                            {
                              "id": 6,
                              "coords": {
                                "latitude": 37.598959,
                                "longitude": 84.435862
                              },
                              "show": false,
                              "sessions": "Sessions: 32"
                            },
                            {
                              "id": 7,
                              "coords": {
                                "latitude": 58.460638,
                                "longitude": 14.387036
                              },
                              "show": false,
                              "sessions": "Sessions: 2"
                            },
                            {
                              "id": 8,
                              "coords": {
                                "latitude": 38.015599,
                                "longitude": -89.675457
                              },
                              "show": false,
                              "sessions": "Sessions: 143"
                            }
                          ]
                        }
                      },
                      "widget3": {
                        "title": "Top 5 pages",
                        "ranges": {
                          "TM": "This Month",
                          "LM": "Last Month"
                        },
                        "currentRange": "TM",
                        "pages": {
                          "LM": [
                            {
                              "path": "/dashboard",
                              "value": 43
                            },
                            {
                              "path": "/mail",
                              "value": 26
                            },
                            {
                              "path": "/todo",
                              "value": 14
                            },
                            {
                              "path": "/teams",
                              "value": 12
                            },
                            {
                              "path": "/profile",
                              "value": 5
                            }
                          ],
                          "TM": [
                            {
                              "path": "/dashboard",
                              "value": 38
                            },
                            {
                              "path": "/mail",
                              "value": 29
                            },
                            {
                              "path": "/todo",
                              "value": 12
                            },
                            {
                              "path": "/teams",
                              "value": 13
                            },
                            {
                              "path": "/profile",
                              "value": 8
                            }
                          ]
                        }
                      },
                      "widget4": {
                        "title": "Audience",
                        "table": {
                          "columns": [
                            {
                              "title": "Audience"
                            },
                            {
                              "title": "Most Visited Page"
                            },
                            {
                              "title": "Avg. Visit Duration"
                            }
                          ]
                        },
                        "tabs": [
                          {
                            "label": "90 days",
                            "groups": [
                              {
                                "title": "Gender",
                                "data": [
                                  {
                                    "title": "Female",
                                    "value": 45,
                                    "progressColor": "md-primary"
                                  },
                                  {
                                    "title": "Male",
                                    "value": 41,
                                    "progressColor": "md-primary"
                                  },
                                  {
                                    "title": "Not Specified",
                                    "value": 12,
                                    "progressColor": "md-primary"
                                  }
                                ]
                              },
                              {
                                "title": "Income",
                                "data": [
                                  {
                                    "title": "< $20k",
                                    "value": 9,
                                    "progressColor": "md-accent"
                                  },
                                  {
                                    "title": "$20k - $50k",
                                    "value": 39,
                                    "progressColor": "md-accent"
                                  },
                                  {
                                    "title": "> $50",
                                    "value": 52,
                                    "progressColor": "md-accent"
                                  }
                                ]
                              },
                              {
                                "title": "Age",
                                "data": [
                                  {
                                    "title": "25 - 34",
                                    "value": 27,
                                    "progressColor": "md-warn"
                                  },
                                  {
                                    "title": "35 - 54",
                                    "value": 32,
                                    "progressColor": "md-warn"
                                  },
                                  {
                                    "title": "55+",
                                    "value": 41,
                                    "progressColor": "md-warn"
                                  }
                                ]
                              },
                              {
                                "title": "Education",
                                "data": [
                                  {
                                    "title": "No College",
                                    "value": 27,
                                    "progressColor": "md-primary"
                                  },
                                  {
                                    "title": "College",
                                    "value": 56,
                                    "progressColor": "md-primary"
                                  },
                                  {
                                    "title": "Advanced",
                                    "value": 17,
                                    "progressColor": "md-primary"
                                  }
                                ]
                              }
                            ]
                          },
                          {
                            "label": "60 days",
                            "groups": [
                              {
                                "title": "Gender",
                                "data": [
                                  {
                                    "title": "Female",
                                    "value": 40,
                                    "progressColor": "md-primary"
                                  },
                                  {
                                    "title": "Male",
                                    "value": 50,
                                    "progressColor": "md-primary"
                                  },
                                  {
                                    "title": "Not Specified",
                                    "value": 10,
                                    "progressColor": "md-primary"
                                  }
                                ]
                              },
                              {
                                "title": "Income",
                                "data": [
                                  {
                                    "title": "< $20k",
                                    "value": 8,
                                    "progressColor": "md-accent"
                                  },
                                  {
                                    "title": "$20k - $50k",
                                    "value": 35,
                                    "progressColor": "md-accent"
                                  },
                                  {
                                    "title": "> $50",
                                    "value": 57,
                                    "progressColor": "md-accent"
                                  }
                                ]
                              },
                              {
                                "title": "Age",
                                "data": [
                                  {
                                    "title": "25 - 34",
                                    "value": 24,
                                    "progressColor": "md-warn"
                                  },
                                  {
                                    "title": "35 - 54",
                                    "value": 26,
                                    "progressColor": "md-warn"
                                  },
                                  {
                                    "title": "55+",
                                    "value": 50,
                                    "progressColor": "md-warn"
                                  }
                                ]
                              },
                              {
                                "title": "Education",
                                "data": [
                                  {
                                    "title": "No College",
                                    "value": 21,
                                    "progressColor": "md-primary"
                                  },
                                  {
                                    "title": "College",
                                    "value": 57,
                                    "progressColor": "md-primary"
                                  },
                                  {
                                    "title": "Advanced",
                                    "value": 22,
                                    "progressColor": "md-primary"
                                  }
                                ]
                              }
                            ]
                          },
                          {
                            "label": "30 days",
                            "groups": [
                              {
                                "title": "Gender",
                                "data": [
                                  {
                                    "title": "Female",
                                    "value": 41,
                                    "progressColor": "md-primary"
                                  },
                                  {
                                    "title": "Male",
                                    "value": 43,
                                    "progressColor": "md-primary"
                                  },
                                  {
                                    "title": "Not Specified",
                                    "value": 16,
                                    "progressColor": "md-primary"
                                  }
                                ]
                              },
                              {
                                "title": "Income",
                                "data": [
                                  {
                                    "title": "< $20k",
                                    "value": 9,
                                    "progressColor": "md-accent"
                                  },
                                  {
                                    "title": "$20k - $50k",
                                    "value": 43,
                                    "progressColor": "md-accent"
                                  },
                                  {
                                    "title": "> $50",
                                    "value": 48,
                                    "progressColor": "md-accent"
                                  }
                                ]
                              },
                              {
                                "title": "Age",
                                "data": [
                                  {
                                    "title": "25 - 34",
                                    "value": 32,
                                    "progressColor": "md-warn"
                                  },
                                  {
                                    "title": "35 - 54",
                                    "value": 25,
                                    "progressColor": "md-warn"
                                  },
                                  {
                                    "title": "55+",
                                    "value": 43,
                                    "progressColor": "md-warn"
                                  }
                                ]
                              },
                              {
                                "title": "Education",
                                "data": [
                                  {
                                    "title": "No College",
                                    "value": 30,
                                    "progressColor": "md-primary"
                                  },
                                  {
                                    "title": "College",
                                    "value": 50,
                                    "progressColor": "md-primary"
                                  },
                                  {
                                    "title": "Advanced",
                                    "value": 20,
                                    "progressColor": "md-primary"
                                  }
                                ]
                              }
                            ]
                          }
                        ]
                      }
                    };
                }
            },
            bodyClass: 'dashboard-analytics'
        });
    }

})();
