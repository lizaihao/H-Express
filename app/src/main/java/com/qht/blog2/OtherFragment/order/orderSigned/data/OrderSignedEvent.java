package com.qht.blog2.OtherFragment.order.orderSigned.data;

import com.qht.blog2.BaseBean.OrderInfoBean;
import com.qht.blog2.BaseEventBus.Event;

/**
 * Created by QHT on 2017-04-10.
 */
public class OrderSignedEvent extends Event {

    public OrderInfoBean Data;
    public int position;
    public boolean checked;

    public OrderSignedEvent(int position, boolean checked, Object source) {
        super(source);
        this.Data=Data;
        this.position=position;
        this.checked=checked;
    }
}
