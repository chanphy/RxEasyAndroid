package com.wjj.easy.easyandroidHelper.module;

import com.wjj.easy.easyandroid.mvp.EasyBasePresenter;
import com.wjj.easy.easyandroidHelper.common.mvp.BaseView;
import com.wjj.easy.easyandroidHelper.model.ProductItemInfo;

import java.util.List;

/**
 * Created by wujiajun on 2017/10/18.
 */

public interface ProductContract {
    interface View extends BaseView {
        void callback(boolean success,List<ProductItemInfo> data);
    }

    interface Presenter extends EasyBasePresenter<ProductContract.View> {
        void getData(int limit, int size);
    }
}
