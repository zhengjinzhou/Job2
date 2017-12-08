package com.zhou.job2.base;

import java.util.List;

/**
 * Created by zhou on 2017/12/8.
 */

public class TypeBean {

    /**
     * code : 10000
     * charge : true
     * msg : 查询成功,扣费
     * result : {"msg":"ok","result":[{"caipiaoid":"1","name":"福利彩票","parentid":"0"},{"caipiaoid":"2","name":"体育彩票","parentid":"0"},{"caipiaoid":"3","name":"足球彩票","parentid":"0"},{"caipiaoid":"4","name":"竞彩","parentid":"0"},{"caipiaoid":"5","name":"高频","parentid":"0"},{"caipiaoid":"6","name":"地方彩","parentid":"0"},{"caipiaoid":"11","name":"双色球","parentid":"1"},{"caipiaoid":"12","name":"福彩3D","parentid":"1"},{"caipiaoid":"13","name":"七乐彩","parentid":"1"},{"caipiaoid":"14","name":"大乐透","parentid":"2"},{"caipiaoid":"15","name":"七星彩","parentid":"2"},{"caipiaoid":"16","name":"排列三","parentid":"2"},{"caipiaoid":"17","name":"排列五","parentid":"2"},{"caipiaoid":"18","name":"14场胜负彩","parentid":"3"},{"caipiaoid":"19","name":"任选九场","parentid":"3"},{"caipiaoid":"20","name":"足球单场","parentid":"3"},{"caipiaoid":"21","name":"竞彩足球","parentid":"4"},{"caipiaoid":"22","name":"竞彩篮球","parentid":"4"},{"caipiaoid":"23","name":"华东福彩15选5","parentid":"1"},{"caipiaoid":"24","name":"东方6+1","parentid":"4"},{"caipiaoid":"67","name":"新3D","parentid":"1"},{"caipiaoid":"27","name":"福彩天天彩选4","parentid":"4"},{"caipiaoid":"30","name":"体彩6+1","parentid":"4"},{"caipiaoid":"29","name":"体彩7位数","parentid":"4"},{"caipiaoid":"31","name":"体彩20选5","parentid":"4"},{"caipiaoid":"33","name":"36选7","parentid":"4"},{"caipiaoid":"34","name":"体彩22选5","parentid":"4"},{"caipiaoid":"35","name":"体彩31选7","parentid":"4"},{"caipiaoid":"37","name":"南粤风采36选7","parentid":"4"},{"caipiaoid":"38","name":"南粤风采26选5","parentid":"4"},{"caipiaoid":"39","name":"南粤风采好彩1","parentid":"4"},{"caipiaoid":"40","name":"深圳风采","parentid":"4"},{"caipiaoid":"41","name":"福彩22选5","parentid":"4"},{"caipiaoid":"42","name":"福彩P62","parentid":"4"},{"caipiaoid":"43","name":"福彩36选7","parentid":"4"},{"caipiaoid":"45","name":"福彩35选7","parentid":"4"},{"caipiaoid":"46","name":"燕赵风采20选5","parentid":"4"},{"caipiaoid":"47","name":"燕赵风采排列7","parentid":"4"},{"caipiaoid":"48","name":"燕赵风采排列5","parentid":"4"},{"caipiaoid":"49","name":"燕赵风采好运彩2","parentid":"4"},{"caipiaoid":"50","name":"燕赵风采好运彩3","parentid":"4"},{"caipiaoid":"51","name":"中原风采22选5","parentid":"4"},{"caipiaoid":"52","name":"楚天风采22选5","parentid":"4"},{"caipiaoid":"55","name":"新疆风采25选7","parentid":"4"},{"caipiaoid":"56","name":"新疆风采35选7","parentid":"4"},{"caipiaoid":"57","name":"新疆风采18选7","parentid":"4"},{"caipiaoid":"60","name":"福彩25选5","parentid":"4"},{"caipiaoid":"61","name":"海南4+1","parentid":"4"},{"caipiaoid":"62","name":"四场进球","parentid":"3"},{"caipiaoid":"63","name":"六场半全场","parentid":"3"},{"caipiaoid":"65","name":"福彩快乐双彩","parentid":"4"},{"caipiaoid":"66","name":"黑龙江6+1","parentid":"4"},{"caipiaoid":"68","name":"11运夺金","parentid":"5"},{"caipiaoid":"69","name":"江西11选5","parentid":"5"},{"caipiaoid":"70","name":"江西新时时彩","parentid":"5"},{"caipiaoid":"71","name":"粤11选5","parentid":"5"},{"caipiaoid":"72","name":"吉林新快3","parentid":"5"},{"caipiaoid":"73","name":"重庆时时彩","parentid":"5"},{"caipiaoid":"74","name":"辽11选5","parentid":"5"},{"caipiaoid":"75","name":"江苏老快3","parentid":"5"},{"caipiaoid":"76","name":"安徽快3","parentid":"5"},{"caipiaoid":"77","name":"幸运赛车","parentid":"5"},{"caipiaoid":"78","name":"广西快3","parentid":"5"},{"caipiaoid":"79","name":"快乐扑克3","parentid":"5"},{"caipiaoid":"80","name":"湖北快3","parentid":"5"},{"caipiaoid":"81","name":"福建快3","parentid":"5"},{"caipiaoid":"82","name":"北京PK拾","parentid":"5"},{"caipiaoid":"83","name":"山东11选5","parentid":"5"},{"caipiaoid":"84","name":"好运11选5","parentid":"5"},{"caipiaoid":"85","name":"重庆11选5","parentid":"5"},{"caipiaoid":"86","name":"易乐11选5","parentid":"5"},{"caipiaoid":"87","name":"易快3","parentid":"5"},{"caipiaoid":"88","name":"快乐彩","parentid":"5"},{"caipiaoid":"89","name":"快乐8","parentid":"5"},{"caipiaoid":"91","name":"山东群英会","parentid":"5"},{"caipiaoid":"90","name":"新疆时时彩","parentid":"5"},{"caipiaoid":"92","name":"重庆幸运农场","parentid":"5"},{"caipiaoid":"93","name":"天津时时彩","parentid":"5"},{"caipiaoid":"94","name":"天津快乐十分","parentid":"5"},{"caipiaoid":"95","name":"四川快乐12","parentid":"5"},{"caipiaoid":"96","name":"北京11选5","parentid":"5"},{"caipiaoid":"97","name":"上海11选5","parentid":"5"},{"caipiaoid":"98","name":"北京快中彩","parentid":"5"},{"caipiaoid":"99","name":"天津11选5","parentid":"5"},{"caipiaoid":"100","name":"河北11选5","parentid":"5"},{"caipiaoid":"101","name":"河北快3","parentid":"5"},{"caipiaoid":"102","name":"内蒙古11选5","parentid":"5"},{"caipiaoid":"103","name":"吉林11选5","parentid":"5"},{"caipiaoid":"104","name":"辽宁快乐12","parentid":"5"},{"caipiaoid":"105","name":"上海快3","parentid":"5"},{"caipiaoid":"106","name":"上海时时乐","parentid":"5"},{"caipiaoid":"107","name":"江苏11选5","parentid":"5"},{"caipiaoid":"108","name":"安徽11选5","parentid":"5"},{"caipiaoid":"109","name":"福建11选5","parentid":"5"},{"caipiaoid":"110","name":"河南11选5","parentid":"5"},{"caipiaoid":"111","name":"河南快3","parentid":"5"},{"caipiaoid":"112","name":"河南快赢481","parentid":"5"},{"caipiaoid":"113","name":"湖北11选5","parentid":"5"},{"caipiaoid":"114","name":"湖南快乐十分","parentid":"5"},{"caipiaoid":"115","name":"广东快乐十分","parentid":"5"},{"caipiaoid":"116","name":"广西11选5","parentid":"5"},{"caipiaoid":"117","name":"广西快乐十分","parentid":"5"},{"caipiaoid":"118","name":"重庆快乐十分","parentid":"5"},{"caipiaoid":"119","name":"重庆百变王牌","parentid":"5"},{"caipiaoid":"120","name":"四川11选5","parentid":"5"},{"caipiaoid":"121","name":"四川扑克彩·十分乐","parentid":"5"},{"caipiaoid":"122","name":"贵州11选5","parentid":"5"},{"caipiaoid":"123","name":"贵州快3","parentid":"5"},{"caipiaoid":"124","name":"陕西11选5","parentid":"5"},{"caipiaoid":"125","name":"甘肃11选5","parentid":"5"},{"caipiaoid":"126","name":"甘肃快3","parentid":"5"},{"caipiaoid":"127","name":"青海快3","parentid":"5"},{"caipiaoid":"128","name":"新疆11选5","parentid":"5"},{"caipiaoid":"129","name":"新疆喜乐彩","parentid":"5"},{"caipiaoid":"130","name":"山西11选5","parentid":"5"},{"caipiaoid":"131","name":"山西泳坛夺金","parentid":"5"},{"caipiaoid":"132","name":"云南11选5","parentid":"5"},{"caipiaoid":"133","name":"云南快乐十分","parentid":"5"},{"caipiaoid":"134","name":"云南时时彩","parentid":"5"},{"caipiaoid":"135","name":"深圳风采","parentid":"4"}],"status":"0"}
     */

    private String code;
    private boolean charge;
    private String msg;
    private ResultBeanX result;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isCharge() {
        return charge;
    }

    public void setCharge(boolean charge) {
        this.charge = charge;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultBeanX getResult() {
        return result;
    }

    public void setResult(ResultBeanX result) {
        this.result = result;
    }

    public static class ResultBeanX {
        /**
         * msg : ok
         * result : [{"caipiaoid":"1","name":"福利彩票","parentid":"0"},{"caipiaoid":"2","name":"体育彩票","parentid":"0"},{"caipiaoid":"3","name":"足球彩票","parentid":"0"},{"caipiaoid":"4","name":"竞彩","parentid":"0"},{"caipiaoid":"5","name":"高频","parentid":"0"},{"caipiaoid":"6","name":"地方彩","parentid":"0"},{"caipiaoid":"11","name":"双色球","parentid":"1"},{"caipiaoid":"12","name":"福彩3D","parentid":"1"},{"caipiaoid":"13","name":"七乐彩","parentid":"1"},{"caipiaoid":"14","name":"大乐透","parentid":"2"},{"caipiaoid":"15","name":"七星彩","parentid":"2"},{"caipiaoid":"16","name":"排列三","parentid":"2"},{"caipiaoid":"17","name":"排列五","parentid":"2"},{"caipiaoid":"18","name":"14场胜负彩","parentid":"3"},{"caipiaoid":"19","name":"任选九场","parentid":"3"},{"caipiaoid":"20","name":"足球单场","parentid":"3"},{"caipiaoid":"21","name":"竞彩足球","parentid":"4"},{"caipiaoid":"22","name":"竞彩篮球","parentid":"4"},{"caipiaoid":"23","name":"华东福彩15选5","parentid":"1"},{"caipiaoid":"24","name":"东方6+1","parentid":"4"},{"caipiaoid":"67","name":"新3D","parentid":"1"},{"caipiaoid":"27","name":"福彩天天彩选4","parentid":"4"},{"caipiaoid":"30","name":"体彩6+1","parentid":"4"},{"caipiaoid":"29","name":"体彩7位数","parentid":"4"},{"caipiaoid":"31","name":"体彩20选5","parentid":"4"},{"caipiaoid":"33","name":"36选7","parentid":"4"},{"caipiaoid":"34","name":"体彩22选5","parentid":"4"},{"caipiaoid":"35","name":"体彩31选7","parentid":"4"},{"caipiaoid":"37","name":"南粤风采36选7","parentid":"4"},{"caipiaoid":"38","name":"南粤风采26选5","parentid":"4"},{"caipiaoid":"39","name":"南粤风采好彩1","parentid":"4"},{"caipiaoid":"40","name":"深圳风采","parentid":"4"},{"caipiaoid":"41","name":"福彩22选5","parentid":"4"},{"caipiaoid":"42","name":"福彩P62","parentid":"4"},{"caipiaoid":"43","name":"福彩36选7","parentid":"4"},{"caipiaoid":"45","name":"福彩35选7","parentid":"4"},{"caipiaoid":"46","name":"燕赵风采20选5","parentid":"4"},{"caipiaoid":"47","name":"燕赵风采排列7","parentid":"4"},{"caipiaoid":"48","name":"燕赵风采排列5","parentid":"4"},{"caipiaoid":"49","name":"燕赵风采好运彩2","parentid":"4"},{"caipiaoid":"50","name":"燕赵风采好运彩3","parentid":"4"},{"caipiaoid":"51","name":"中原风采22选5","parentid":"4"},{"caipiaoid":"52","name":"楚天风采22选5","parentid":"4"},{"caipiaoid":"55","name":"新疆风采25选7","parentid":"4"},{"caipiaoid":"56","name":"新疆风采35选7","parentid":"4"},{"caipiaoid":"57","name":"新疆风采18选7","parentid":"4"},{"caipiaoid":"60","name":"福彩25选5","parentid":"4"},{"caipiaoid":"61","name":"海南4+1","parentid":"4"},{"caipiaoid":"62","name":"四场进球","parentid":"3"},{"caipiaoid":"63","name":"六场半全场","parentid":"3"},{"caipiaoid":"65","name":"福彩快乐双彩","parentid":"4"},{"caipiaoid":"66","name":"黑龙江6+1","parentid":"4"},{"caipiaoid":"68","name":"11运夺金","parentid":"5"},{"caipiaoid":"69","name":"江西11选5","parentid":"5"},{"caipiaoid":"70","name":"江西新时时彩","parentid":"5"},{"caipiaoid":"71","name":"粤11选5","parentid":"5"},{"caipiaoid":"72","name":"吉林新快3","parentid":"5"},{"caipiaoid":"73","name":"重庆时时彩","parentid":"5"},{"caipiaoid":"74","name":"辽11选5","parentid":"5"},{"caipiaoid":"75","name":"江苏老快3","parentid":"5"},{"caipiaoid":"76","name":"安徽快3","parentid":"5"},{"caipiaoid":"77","name":"幸运赛车","parentid":"5"},{"caipiaoid":"78","name":"广西快3","parentid":"5"},{"caipiaoid":"79","name":"快乐扑克3","parentid":"5"},{"caipiaoid":"80","name":"湖北快3","parentid":"5"},{"caipiaoid":"81","name":"福建快3","parentid":"5"},{"caipiaoid":"82","name":"北京PK拾","parentid":"5"},{"caipiaoid":"83","name":"山东11选5","parentid":"5"},{"caipiaoid":"84","name":"好运11选5","parentid":"5"},{"caipiaoid":"85","name":"重庆11选5","parentid":"5"},{"caipiaoid":"86","name":"易乐11选5","parentid":"5"},{"caipiaoid":"87","name":"易快3","parentid":"5"},{"caipiaoid":"88","name":"快乐彩","parentid":"5"},{"caipiaoid":"89","name":"快乐8","parentid":"5"},{"caipiaoid":"91","name":"山东群英会","parentid":"5"},{"caipiaoid":"90","name":"新疆时时彩","parentid":"5"},{"caipiaoid":"92","name":"重庆幸运农场","parentid":"5"},{"caipiaoid":"93","name":"天津时时彩","parentid":"5"},{"caipiaoid":"94","name":"天津快乐十分","parentid":"5"},{"caipiaoid":"95","name":"四川快乐12","parentid":"5"},{"caipiaoid":"96","name":"北京11选5","parentid":"5"},{"caipiaoid":"97","name":"上海11选5","parentid":"5"},{"caipiaoid":"98","name":"北京快中彩","parentid":"5"},{"caipiaoid":"99","name":"天津11选5","parentid":"5"},{"caipiaoid":"100","name":"河北11选5","parentid":"5"},{"caipiaoid":"101","name":"河北快3","parentid":"5"},{"caipiaoid":"102","name":"内蒙古11选5","parentid":"5"},{"caipiaoid":"103","name":"吉林11选5","parentid":"5"},{"caipiaoid":"104","name":"辽宁快乐12","parentid":"5"},{"caipiaoid":"105","name":"上海快3","parentid":"5"},{"caipiaoid":"106","name":"上海时时乐","parentid":"5"},{"caipiaoid":"107","name":"江苏11选5","parentid":"5"},{"caipiaoid":"108","name":"安徽11选5","parentid":"5"},{"caipiaoid":"109","name":"福建11选5","parentid":"5"},{"caipiaoid":"110","name":"河南11选5","parentid":"5"},{"caipiaoid":"111","name":"河南快3","parentid":"5"},{"caipiaoid":"112","name":"河南快赢481","parentid":"5"},{"caipiaoid":"113","name":"湖北11选5","parentid":"5"},{"caipiaoid":"114","name":"湖南快乐十分","parentid":"5"},{"caipiaoid":"115","name":"广东快乐十分","parentid":"5"},{"caipiaoid":"116","name":"广西11选5","parentid":"5"},{"caipiaoid":"117","name":"广西快乐十分","parentid":"5"},{"caipiaoid":"118","name":"重庆快乐十分","parentid":"5"},{"caipiaoid":"119","name":"重庆百变王牌","parentid":"5"},{"caipiaoid":"120","name":"四川11选5","parentid":"5"},{"caipiaoid":"121","name":"四川扑克彩·十分乐","parentid":"5"},{"caipiaoid":"122","name":"贵州11选5","parentid":"5"},{"caipiaoid":"123","name":"贵州快3","parentid":"5"},{"caipiaoid":"124","name":"陕西11选5","parentid":"5"},{"caipiaoid":"125","name":"甘肃11选5","parentid":"5"},{"caipiaoid":"126","name":"甘肃快3","parentid":"5"},{"caipiaoid":"127","name":"青海快3","parentid":"5"},{"caipiaoid":"128","name":"新疆11选5","parentid":"5"},{"caipiaoid":"129","name":"新疆喜乐彩","parentid":"5"},{"caipiaoid":"130","name":"山西11选5","parentid":"5"},{"caipiaoid":"131","name":"山西泳坛夺金","parentid":"5"},{"caipiaoid":"132","name":"云南11选5","parentid":"5"},{"caipiaoid":"133","name":"云南快乐十分","parentid":"5"},{"caipiaoid":"134","name":"云南时时彩","parentid":"5"},{"caipiaoid":"135","name":"深圳风采","parentid":"4"}]
         * status : 0
         */

        private String msg;
        private String status;
        private List<ResultBean> result;

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<ResultBean> getResult() {
            return result;
        }

        public void setResult(List<ResultBean> result) {
            this.result = result;
        }

        public static class ResultBean {
            /**
             * caipiaoid : 1
             * name : 福利彩票
             * parentid : 0
             */

            private String caipiaoid;
            private String name;
            private String parentid;

            public String getCaipiaoid() {
                return caipiaoid;
            }

            public void setCaipiaoid(String caipiaoid) {
                this.caipiaoid = caipiaoid;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getParentid() {
                return parentid;
            }

            public void setParentid(String parentid) {
                this.parentid = parentid;
            }

            @Override
            public String toString() {
                return "ResultBean{" +
                        "caipiaoid='" + caipiaoid + '\'' +
                        ", name='" + name + '\'' +
                        ", parentid='" + parentid + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "ResultBeanX{" +
                    "msg='" + msg + '\'' +
                    ", status='" + status + '\'' +
                    ", result=" + result +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "TypeBean{" +
                "code='" + code + '\'' +
                ", charge=" + charge +
                ", msg='" + msg + '\'' +
                ", result=" + result +
                '}';
    }
}
