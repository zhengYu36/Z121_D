package com.zy.demo;

/**
 * <ul>
 * <li>文件包名 : com.zy.demo</li>
 * <li>创建时间 : 2019/11/1 10:06</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：字段实体类
 *
 * @author zhengyu
 */
public class DictEntry {

    //字段类型对应关系表
    public enum Type {
        one(1, "待审核"),
        two(2, "已同意"),
        three(3, "已拒绝");
        private int code;
        private String name;

        Type(int code, String name) {
            this.code = code;
            this.name = name;
        }

        public static String getNameByCode(int code) {
            for (Type t : Type.values()) {
                if (t.code == code) {
                    return t.name;
                }
            }
            return null;
        }

        public int getCode() {
            return code;
        }

        public String getName() {
            return name;
        }
    }

    //猪类型
    public enum PigType {
        yf(1, "育肥猪2号", "中国"),
        by(2, "保育猪7号", "美国");
        private int code;
        private String name;
        private String memo;

        PigType(int code, String name, String memo) {
            this.code = code;
            this.name = name;
            this.memo = memo;
        }

        public int getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        public String getMemo() {
            return memo;
        }
    }

}
