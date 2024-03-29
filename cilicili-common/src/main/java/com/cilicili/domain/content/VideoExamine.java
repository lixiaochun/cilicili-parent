/**
 * 
 */
package com.cilicili.domain.content;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * @author 李明睿
 * 2019年5月23日
 */
@Data
@TableName("tb_video_examine")
public class VideoExamine {
	private Long id;
	private String videoId;
	private Integer videoStatus;
	private Date videoLastExamineTime;
	private Date videoApprovalTime;
	private Integer adminId;
	private Integer reasonId;
}
