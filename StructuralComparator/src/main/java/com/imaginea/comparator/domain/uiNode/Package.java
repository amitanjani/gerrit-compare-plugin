package com.imaginea.comparator.domain.uiNode;

import com.imaginea.comparator.repo.ComparatorUtil;

public class Package {
	com.imaginea.comparator.domain.Package pkg;

	public Package(com.imaginea.comparator.domain.Package pkg) {
		this.pkg = pkg;
	}

	public com.imaginea.comparator.domain.Package getPkg() {
		return pkg;
	}

	public void setPkg(com.imaginea.comparator.domain.Package pkg) {
		this.pkg = pkg;
	}

	@Override
	public String toString() {
		String obj = null;
		if (this.pkg.getDiff() != ComparatorUtil.EXPECTEDDEFAULT)
			obj = this.pkg.getLines(0).getValue();
		else
			obj = this.pkg.getLines(1).getValue();
		return obj;
	}
}
