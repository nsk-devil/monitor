package com.micropower.manager.service;

import com.micropower.manager.model.po.Saveconfig;

import java.util.List;

/**
 * Created by oliver on 2017/9/4.
 */
public interface SaveConfigService extends BaseService<Saveconfig> {
    List<Saveconfig> list();
}
