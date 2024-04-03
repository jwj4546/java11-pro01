package org.haeundae.dto;

public class Data {
	private int no;
	private String title;
	private String datafile;
	private String content;
	private String resdate;
	private int visited;
	
	public Data() {}
	public Data(int no, String title, String datafile, String content, String resdate, int visited) {
		super();
		this.no = no;
		this.title = title;
		this.datafile = datafile;
		this.content = content;
		this.resdate = resdate;
		this.visited = visited;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDatafile() {
		return datafile;
	}
	public void setDatafile(String datafile) {
		this.datafile = datafile;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getResdate() {
		return resdate;
	}
	public void setResdate(String resdate) {
		this.resdate = resdate;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}
	@Override
	public String toString() {
		return "Data [no=" + no + ", title=" + title + ", datafile=" + datafile + ", content=" + content + ", resdate="
				+ resdate + ", visited=" + visited + "]";
	}
}
