package com.macat.service;

public class MberGradVO {
	
	private String mber_grad_nm, mber_grad_ord;
	
	public MberGradVO() {

	}

	public MberGradVO(String mber_grad_nm, String mber_grad_ord) {
		super();
		this.mber_grad_nm = mber_grad_nm;
		this.mber_grad_ord = mber_grad_ord;
	}

	public String getMber_grad_nm() {
		return mber_grad_nm;
	}

	public void setMber_grad_nm(String mber_grad_nm) {
		this.mber_grad_nm = mber_grad_nm;
	}

	public String getMber_grad_ord() {
		return mber_grad_ord;
	}

	public void setMber_grad_ord(String mber_grad_ord) {
		this.mber_grad_ord = mber_grad_ord;
	}
	
}
