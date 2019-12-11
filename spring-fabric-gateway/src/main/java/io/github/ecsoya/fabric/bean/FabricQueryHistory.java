package io.github.ecsoya.fabric.bean;

import java.util.Date;

import lombok.Data;

/**
 * Fabric object querying history.
 * 
 * @author ecsoya
 *
 */
@Data
public class FabricQueryHistory {

	private Date date;

	private String ip;

	public FabricQueryHistory(String ip, Date date) {
		this.ip = ip;
		this.date = date;
	}

	public FabricQueryHistory(String ip) {
		this.ip = ip;
		date = new Date();
	}
}
