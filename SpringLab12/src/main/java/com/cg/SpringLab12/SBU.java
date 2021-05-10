package com.cg.SpringLab12;

public class SBU {
	private int sbuild;
	private String sbuName;
	private String sbuHead;
	
	public SBU() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public SBU(int sbuild, String sbuName, String sbuHead) {
		super();
		this.sbuild = sbuild;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}
	public int getSbuild() {
		return sbuild;
	}
	
	public void setSbuild(int sbuild) {
		this.sbuild = sbuild;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	@Override
	public String toString() {
		return "SBU [sbuild=" + sbuild + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	
	

}
