/*
 *      Copyright (c) 2018-2028, Chill Zhuang All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the dreamlu.net developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: Chill 庄骞 (smallchill@163.com)
 */
package org.springblade.mng.cgform.service;

import com.alibaba.fastjson.JSONObject;
import org.springblade.mng.cgform.entity.CgformEnhanceJs;
import org.springblade.mng.cgform.entity.CgformHead;
import org.springblade.mng.cgform.model.OnlineConfigModel;


/**
 * @author BladeX
 * @since 2021-05-22
 */
public interface IOnlineService {

    //获取头部信息
    OnlineConfigModel queryOnlineConfig(CgformHead head);

    //获取字段内容
    JSONObject queryOnlineFormObj(CgformHead onlcgformhead, CgformEnhanceJs onlcgformenhancejs);

    JSONObject queryOnlineFormObj(CgformHead cgformhead);
}
