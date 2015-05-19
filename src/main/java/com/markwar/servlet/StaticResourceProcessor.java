package com.markwar.servlet;

import java.io.IOException;

public class StaticResourceProcessor {
	public void process(Request request,Response resopnse) {
		try {
			resopnse.sendStaticResource();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
