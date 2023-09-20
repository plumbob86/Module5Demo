/**
 * @author lscha - lrschanus
 * CIS175 - Fall 2021
 * Sep 20, 2023
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author lscha
 *
 */
@Entity(name = "trees")
@Table(name = "trees")
public class Tree {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rowId;

	private String commonName;
	private String latinName;
	private double avgHeight;

	public int getRowId() {
		return rowId;
	}

	public void setRowId(int rowId) {
		this.rowId = rowId;
	}

	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public String getLatinName() {
		return latinName;
	}

	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}

	public double getAvgHeight() {
		return avgHeight;
	}

	public void setAvgHeight(double avgHeight) {
		this.avgHeight = avgHeight;
	}

}
