/**
 * 
 */
package com.cilicili.domain.content;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * @author 李明睿
 * 2019年5月23日
 */
@Data
@TableName("tb_video_url")
public class VideoUrl {
	private Long id;
	private String videoId;
	private String actualUrl;
	private String requestUrl;
	private String reserved;
}
