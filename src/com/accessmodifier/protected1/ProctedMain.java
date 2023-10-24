package com.accessmodifier.protected1;

import com.accessmodifier.ProtectedAccess;

public class ProctedMain {
	public static void main(String[] args) {
		ProtectedAccess proAccessSpecifier = new ProtectedAccess();
		// you can't access protected method outside a package
		//		proAccessSpecifier.show();

	}
}
