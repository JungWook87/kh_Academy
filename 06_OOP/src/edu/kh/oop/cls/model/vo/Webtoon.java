package edu.kh.oop.cls.model.vo;

public class Webtoon {
	
	private String name;
	private String site;
	private String day;
	private String genre;
	
	public Webtoon() {
		name = "웹툰이름을 적어주세요";
		site = "웹툰이 연제되는 사이트를 적어주세요";
		day = "웹툰이 연제되는 요일을 적어주세요";
		genre = "웹툰의 장르를 적어주세요";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}

	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}
