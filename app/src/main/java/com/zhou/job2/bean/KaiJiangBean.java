package com.zhou.job2.bean;

import java.util.List;

/**
 * Created by zhou on 2017/12/8.
 */

public class KaiJiangBean {

    /**
     * code : 10000
     * charge : true
     * msg : 查询成功,扣费
     * result : {"msg":"ok","result":{"number":"02 10 12 21 23 27","refernumber":"12","saleamount":"405427926","caipiaoid":"11","opendate":"2014-11-02","totalmoney":"71262030","issueno":"2014127","deadline":"2014-12-31","prize":[{"num":"15","singlebonus":"5666666","require":"","prizename":"一等奖"},{"num":"189","singlebonus":"94735","require":"","prizename":"二等奖"},{"num":"2512","singlebonus":"3000","require":"","prizename":"三等奖"},{"num":"105324","singlebonus":"200","require":"","prizename":"四等奖"},{"num":"1773966","singlebonus":"10","require":"","prizename":"五等奖"},{"num":"16139836","singlebonus":"5","require":"","prizename":"六等奖"},{"num":"0","singlebonus":"0","require":"中2+1/1+1/0+1","prizename":""}]},"status":"0"}
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
         * result : {"number":"02 10 12 21 23 27","refernumber":"12","saleamount":"405427926","caipiaoid":"11","opendate":"2014-11-02","totalmoney":"71262030","issueno":"2014127","deadline":"2014-12-31","prize":[{"num":"15","singlebonus":"5666666","require":"","prizename":"一等奖"},{"num":"189","singlebonus":"94735","require":"","prizename":"二等奖"},{"num":"2512","singlebonus":"3000","require":"","prizename":"三等奖"},{"num":"105324","singlebonus":"200","require":"","prizename":"四等奖"},{"num":"1773966","singlebonus":"10","require":"","prizename":"五等奖"},{"num":"16139836","singlebonus":"5","require":"","prizename":"六等奖"},{"num":"0","singlebonus":"0","require":"中2+1/1+1/0+1","prizename":""}]}
         * status : 0
         */

        private String msg;
        private ResultBean result;
        private String status;

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public ResultBean getResult() {
            return result;
        }

        public void setResult(ResultBean result) {
            this.result = result;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public static class ResultBean {
            /**
             * number : 02 10 12 21 23 27
             * refernumber : 12
             * saleamount : 405427926
             * caipiaoid : 11
             * opendate : 2014-11-02
             * totalmoney : 71262030
             * issueno : 2014127
             * deadline : 2014-12-31
             * prize : [{"num":"15","singlebonus":"5666666","require":"","prizename":"一等奖"},{"num":"189","singlebonus":"94735","require":"","prizename":"二等奖"},{"num":"2512","singlebonus":"3000","require":"","prizename":"三等奖"},{"num":"105324","singlebonus":"200","require":"","prizename":"四等奖"},{"num":"1773966","singlebonus":"10","require":"","prizename":"五等奖"},{"num":"16139836","singlebonus":"5","require":"","prizename":"六等奖"},{"num":"0","singlebonus":"0","require":"中2+1/1+1/0+1","prizename":""}]
             */

            private String number;
            private String refernumber;
            private String saleamount;
            private String caipiaoid;
            private String opendate;
            private String totalmoney;
            private String issueno;
            private String deadline;
            private List<PrizeBean> prize;

            public String getNumber() {
                return number;
            }

            public void setNumber(String number) {
                this.number = number;
            }

            public String getRefernumber() {
                return refernumber;
            }

            public void setRefernumber(String refernumber) {
                this.refernumber = refernumber;
            }

            public String getSaleamount() {
                return saleamount;
            }

            public void setSaleamount(String saleamount) {
                this.saleamount = saleamount;
            }

            public String getCaipiaoid() {
                return caipiaoid;
            }

            public void setCaipiaoid(String caipiaoid) {
                this.caipiaoid = caipiaoid;
            }

            public String getOpendate() {
                return opendate;
            }

            public void setOpendate(String opendate) {
                this.opendate = opendate;
            }

            public String getTotalmoney() {
                return totalmoney;
            }

            public void setTotalmoney(String totalmoney) {
                this.totalmoney = totalmoney;
            }

            public String getIssueno() {
                return issueno;
            }

            public void setIssueno(String issueno) {
                this.issueno = issueno;
            }

            public String getDeadline() {
                return deadline;
            }

            public void setDeadline(String deadline) {
                this.deadline = deadline;
            }

            public List<PrizeBean> getPrize() {
                return prize;
            }

            public void setPrize(List<PrizeBean> prize) {
                this.prize = prize;
            }

            public static class PrizeBean {
                /**
                 * num : 15
                 * singlebonus : 5666666
                 * require :
                 * prizename : 一等奖
                 */

                private String num;
                private String singlebonus;
                private String require;
                private String prizename;

                public String getNum() {
                    return num;
                }

                public void setNum(String num) {
                    this.num = num;
                }

                public String getSinglebonus() {
                    return singlebonus;
                }

                public void setSinglebonus(String singlebonus) {
                    this.singlebonus = singlebonus;
                }

                public String getRequire() {
                    return require;
                }

                public void setRequire(String require) {
                    this.require = require;
                }

                public String getPrizename() {
                    return prizename;
                }

                public void setPrizename(String prizename) {
                    this.prizename = prizename;
                }
            }
        }
    }
}
