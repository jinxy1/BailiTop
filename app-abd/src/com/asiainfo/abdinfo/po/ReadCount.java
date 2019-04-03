package com.asiainfo.abdinfo.po;

import java.io.Serializable;

public class ReadCount implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//已读
	private String readEnd;
	
	//需要读的
	private String needRead;
	
	//已读的书
	private String alreadyBook;
	

	public String getReadEnd() {
		return readEnd;
	}

	public void setReadEnd(String readEnd) {
		this.readEnd = readEnd;
	}

	public String getNeedRead() {
		return needRead;
	}

	public void setNeedRead(String needRead) {
		this.needRead = needRead;
	}

	public String getAlreadyBook() {
		return alreadyBook;
	}

	public void setAlreadyBook(String alreadyBook) {
		this.alreadyBook = alreadyBook;
	}

	@Override
	public String toString() {
		return "ReadCount [readEnd=" + readEnd + ", needRead=" + needRead + ", alreadyBook=" + alreadyBook + "]";
	}


	
	
	

}
