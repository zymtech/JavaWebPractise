package org.smart4j.framework.bean;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 10/25/2016.
 */
public class Handler {
    // controller class
    private Class<?> controllerClass;
    //action method
    private Method actionMethod;

    public Handler(Class<?> controllerClass, Method actionMethod){
        this.actionMethod = actionMethod;
        this.controllerClass = controllerClass;
    }

    public Class<?> getControllerClass() {
        return controllerClass;
    }

    public Method getActionMethod() {
        return actionMethod;
    }


}
