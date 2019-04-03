var dom = document.getElementById("networkDiagram");
var myChart = echarts.init(dom);
var app = {};
option = null;
app.title = '简单关系网络';
option = {
    title : {
        text: '邢梦鸽关系网',
        x:'right',
        y:'bottom'
    },
    tooltip : {
        trigger: 'item',
        formatter: '{a} : {b}'
    },
    toolbox: {
        show : true,
        feature : {
            restore : {show: true},
            magicType: {show: true, type: ['force', 'chord']},
            saveAsImage : {show: true}
        },
        y:'top'
    },
    legend: {
        x: 'left',
        data:['同事','朋友']
    },
    series : [
        {
            type:'force',
            name : "人物关系",
            ribbonType: false,
            categories : [
                {
                    name: '人物'
                },
                {
                    name: '同事'
                },
                {
                    name:'朋友'
                }
            ],
            itemStyle: {
                normal: {
                    label: {
                        show: true,
                        textStyle: {
                            color: '#333'
                        }
                    },
                    nodeStyle : {
                        brushType : 'both',
                        borderColor : 'rgba(255,215,0,0.4)',
                        borderWidth : 1
                    },
                    linkStyle: {
                        type: 'curve'
                    }
                },
                emphasis: {
                    label: {
                        show: false
                        // textStyle: null      // 默认使用全局文本样式，详见TEXTSTYLE
                    },
                    nodeStyle : {
                        //r: 30
                    },
                    linkStyle : {}
                }
            },
            useWorker: false,
            minRadius : 15,
            maxRadius : 25,
            gravity: 1.1,
            scaling: 1.1,
            roam: 'move',
            nodes:[
                {category:0, name: '邢梦鸽', value : 10, label: '邢梦鸽\n（主要）'},
                {category:1, name: '那丽颖',value : 2},
                {category:1, name: '王慧敏',value : 3},
                {category:1, name: '崔梦晓',value : 3},           
                {category:1, name: '进晓宇',value : 3},
                {category:1, name: '王海成',value : 3},
                 {category:1, name: '鲍雪松',value : 3},
                {category:2, name: '马晓飞',value : 5},
                {category:2, name: '刘楠',value : 8},
                {category:2, name: '李娟娟',value : 9},
                {category:2, name: '邢金花',value : 4},
                {category:2, name: '陈柳',value : 4},
               
            ],
            links : [
                {source : '那丽颖', target : '邢梦鸽', weight : 1, name: '同事'},
                {source : '王慧敏', target : '邢梦鸽', weight : 2, name: '同事'},
                {source : '崔梦晓', target : '邢梦鸽', weight : 1, name: '同事'},
                {source : '进晓宇', target : '邢梦鸽', weight : 2, name: '同事'},
                {source : '王海成', target : '邢梦鸽', weight : 1, name: '同事'},
                 {source : '鲍雪松', target : '邢梦鸽', weight : 1, name: '同事'},
                 
                {source : '马晓飞', target : '邢梦鸽', weight : 2,name:'朋友'},
                {source : '刘楠', target : '邢梦鸽', weight : 3, name: '朋友'},
                {source : '邢金花', target : '邢梦鸽', weight : 1, name: '朋友'},
                {source : '李娟娟', target : '邢梦鸽', weight : 6, name: '朋友'},
                {source : '陈柳', target : '邢梦鸽', weight : 1, name: '朋友'},
                
                {source : '马晓飞', target : '邢金花', weight : 2,name:'朋友'},
                {source : '邢金花', target : '陈柳', weight : 3, name: '朋友'},
                
                {source : '邢金花', target : '进晓宇', weight : 1, name: '朋友'},
                {source : '鲍雪松', target : '进晓宇', weight : 6, name: '同事'},
                {source : '鲍雪松', target : '王海成', weight : 1, name: '朋友'}
                
                
            
            ]
        }
    ]
};
var ecConfig =echarts.config;
function focus(param) {
    var data = param.data;
    var links = option.series[0].links;
    var nodes = option.series[0].nodes;
    if (
        data.source !== undefined
        && data.target !== undefined
    ) { //点击的是边
        var sourceNode = nodes.filter(function (n) {return n.name == data.source})[0];
        var targetNode = nodes.filter(function (n) {return n.name == data.target})[0];
        console.log("选中了边 " + sourceNode.name + ' -> ' + targetNode.name + ' (' + data.weight + ')');
    } else { // 点击的是点
        console.log("选中了" + data.name + '(' + data.value + ')');
    }
}
myChart.on(ecConfig.EVENT.CLICK, focus)

myChart.on(ecConfig.EVENT.FORCE_LAYOUT_END, function () {
    console.log(myChart.chart.force.getPosition());
});
myChart.setOption(option);


                    