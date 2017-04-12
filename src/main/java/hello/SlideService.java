package hello;
import java.util.List;

public interface SlideService {
	SlideBar findById(int id);
	void saveWebpage(SlideBar webInfo);
	void updateWebpage(SlideBar webInfo);
	void deleteUserById(int id);
	List<SlideBar> findAllWebPages();
}
