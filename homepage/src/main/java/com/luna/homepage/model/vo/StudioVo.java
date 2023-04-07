package com.luna.homepage.model.vo;

public class StudioVo {
	
	private int no, studioPrice;
	private String studioName, studioInfo, studioPhoto, studioManager, studioAdd;
	
	public StudioVo() {}

	public StudioVo(int no, int studioPrice, String studioName, String studioInfo, String studioPhoto, String studioManager, String studioAdd) {
		super();
		this.no = no;
		this.studioPrice = studioPrice;
		this.studioName = studioName;
		this.studioInfo = studioInfo;
		this.studioPhoto = studioPhoto;
		this.studioManager = studioManager;
		this.studioAdd = studioAdd;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getStudioPrice() {
		return studioPrice;
	}

	public void setStudioPrice(int studioPrice) {
		this.studioPrice = studioPrice;
	}

	public String getStudioName() {
		return studioName;
	}

	public void setStudioName(String studioName) {
		this.studioName = studioName;
	}

	public String getStudioInfo() {
		return studioInfo;
	}

	public void setStudioInfo(String studioInfo) {
		this.studioInfo = studioInfo;
	}

	public String getStudioPhoto() {
		return studioPhoto;
	}

	public void setStudioPhoto(String studioPhoto) {
		this.studioPhoto = studioPhoto;
	}

	public String getStudioManager() {
		return studioManager;
	}

	public void setStudioManager(String studioManager) {
		this.studioManager = studioManager;
	}
	
	public String getStudioAdd() {
		return studioAdd;
	}

	public void setStudioAdd(String studioAdd) {
		this.studioAdd = studioAdd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + no;
		result = prime * result + ((studioAdd == null) ? 0 : studioAdd.hashCode());
		result = prime * result + ((studioInfo == null) ? 0 : studioInfo.hashCode());
		result = prime * result + ((studioManager == null) ? 0 : studioManager.hashCode());
		result = prime * result + ((studioName == null) ? 0 : studioName.hashCode());
		result = prime * result + ((studioPhoto == null) ? 0 : studioPhoto.hashCode());
		result = prime * result + studioPrice;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudioVo other = (StudioVo) obj;
		if (no != other.no)
			return false;
		if (studioAdd == null) {
			if (other.studioAdd != null)
				return false;
		} else if (!studioAdd.equals(other.studioAdd))
			return false;
		if (studioInfo == null) {
			if (other.studioInfo != null)
				return false;
		} else if (!studioInfo.equals(other.studioInfo))
			return false;
		if (studioManager == null) {
			if (other.studioManager != null)
				return false;
		} else if (!studioManager.equals(other.studioManager))
			return false;
		if (studioName == null) {
			if (other.studioName != null)
				return false;
		} else if (!studioName.equals(other.studioName))
			return false;
		if (studioPhoto == null) {
			if (other.studioPhoto != null)
				return false;
		} else if (!studioPhoto.equals(other.studioPhoto))
			return false;
		if (studioPrice != other.studioPrice)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StudioVo [no=" + no + ", studioPrice=" + studioPrice + ", studioName=" + studioName + ", studioInfo=" + studioInfo + ", studioPhoto=" + studioPhoto + ", studioManager=" + studioManager
				+ ", studioAdd=" + studioAdd + "]";
	}

	
	
}
