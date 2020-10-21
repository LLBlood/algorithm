package com.carfi.designmodel.createmodel.decorator;

/**
 * com.carfi.designmodel.createmodel.decorator$
 *
 * @author ll
 * @date 2020-10-21 14:09:15
 **/
public abstract class Decorator extends Component {
    private Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
