package com.zy.designModel20;

/**
 * <ul>
 * <li>文件包名 : com.zy.designModel20</li>
 * <li>创建时间 : 2020/8/25 10:04</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明：
 *
 * @author zhengyu
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method(){
        if(state.getValue().equals("state1")){
            state.method1();
        }else if(state.getValue().equals("state2")){
            state.method2();
        }
    }
}
