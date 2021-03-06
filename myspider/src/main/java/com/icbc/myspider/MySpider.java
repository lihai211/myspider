package com.icbc.myspider;

import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.scheduler.FileCacheQueueScheduler;

import com.icbc.myspider.util.Constants;
/*
 * 功能：爬虫入口，爬取并下载论坛上的图片，仅供学习
 * 论坛域名已经隐去，请在Constants里自行配置
 */
public class MySpider {

	public static void main(String[] args) {
		Spider.create(new CaoLiuPageProcessor())
				.addUrl(Constants.START_URL)
				.addPipeline(new ImgPipeline())
				.setScheduler(new FileCacheQueueScheduler(Constants.FILE_CACHE_URLS))
				.thread(10)
				.run();
				
	}

}