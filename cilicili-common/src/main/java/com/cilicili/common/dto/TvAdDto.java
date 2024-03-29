/**
 * 
 */
package com.cilicili.common.dto;

import lombok.Data;

/**
 * 传送到首页的临时对象
 * @author 李明睿
 * 2019年5月23日
 */
@Data
public class TvAdDto {
	private String id;
	private String videoDuration;
	private String name;
	private String videoDescribe;
	private String picAlt;
	private String picPath;
	private Integer isVip;
	private Long videoPlayedNum;
	private Long bulletScreenNum;
	private String link;
}
