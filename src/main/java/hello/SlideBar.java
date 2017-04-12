package hello;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="slide_bar")
public class SlideBar {
	
	private Integer page_id;

	@Column(name="urlHinh", unique=true, nullable=false)
	private String urlHinh;
	
	
	public SlideBar() {
		super();
	}
	public SlideBar(String urlHinh) {
		super();
		this.urlHinh = urlHinh;
	}
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getPage_id() {
		return page_id;
	}
	public void setPage_id(Integer page_id) {
		this.page_id = page_id;
	}
	public String getUrlHinh() {
		return urlHinh;
	}
	public void setUrlHinh(String urlHinh) {
		this.urlHinh = urlHinh;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((page_id == null) ? 0 : page_id.hashCode());
		return result;
	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (!(obj instanceof webInfo))
//			return false;
//		webInfo other = (webInfo) obj;
//		if (page_id == null) {
//			if (other.page_id != null)
//				return false;
//		} else if (!page_id.equals(other.page_id))
//			return false;
//		
//		return true;
//	}
	@Override
	public String toString() {
		return "webInfo [page_id=" + page_id + ", description=" + urlHinh ;
	}

	
}
