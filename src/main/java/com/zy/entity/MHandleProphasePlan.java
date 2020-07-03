package com.zy.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * <ul>
 * <li>文件包名 : earlyWork</li>
 * <li>创建时间 : 2020/2/3 15:22</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 类说明： 物料管理 物料进场管理 前期计划
 * 历史记录是多条  物料也是多条
 *
 * @author zhengyu
 */
@Data
public class MHandleProphasePlan{

    private String projectId;

    //组织id
    private String orgId;
    private String orgName;

    //审核人
    private String auditorUserId;
    private String auditorUserName;
    //审核人期限 (单位:天)
    private Integer auditorLimitDay;

    //计划完成时间 创建条目的时间+期限
    private Date auditorPlanDate;
    //实际完成时间
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date auditorRealDate;

    //审批人
    private String checkUserId;
    private String checkUserName;
    //审批人期限 (单位:天)
    private Integer checkLimitDay;
    //审批人计划时间
    private Date checkPlanDate;
    //审批人实际完成时间
    private Date checkRealDate;
}
