package com.easypets.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("serial")
@MappedSuperclass
public class AbstractEntity <ID extends Serializable> implements Serializable{
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		AbstractEntity<?> other = (AbstractEntity<?>) obj;
		if(Id == null) {
			if(other.Id != null)
				return false;
		}
		return true;
	}
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID Id;
	
	public ID getId() {
		return Id;
	}
	
	public void setId(ID id) {
		Id = id;
	}
	
	public String toString() {
		return "id = " + Id;
	}
}
