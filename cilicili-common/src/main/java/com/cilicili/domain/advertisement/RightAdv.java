package com.cilicili.domain.advertisement;

import java.sql.Timestamp;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("tb_right_adv")
public class RightAdv {

//	id	int
	private int id;
//	type	int
	private int type;
//	url	varchar
	private String url;
//	img_src	varchar
	private String imgSrc;
//	alt	varchar
	private String alt;
//	remark	varchar
	private String remark;
//	create_time	timestamp
	private Timestamp createTime;
//	update_time	timestamp
	private Timestamp updateTime;
//	operator_id	int
	private int operatorId;
//	status	int
	private int status;
}
