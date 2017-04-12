package hello;
import java.util.List;

public interface SlideBarDAO {
	SlideBar findByid(int id);
	List<SlideBar> findAllWebpages();
	void save(SlideBar webInfo);
	void deleteById(int id);
}

