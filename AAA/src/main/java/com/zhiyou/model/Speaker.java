package com.zhiyou.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Speaker {
	private int id;
	private String speaker_name;
	private String speaker_desc;
	private String speaker_job;
	private String pic_url;
	
}
