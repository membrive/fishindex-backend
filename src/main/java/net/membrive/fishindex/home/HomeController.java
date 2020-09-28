package net.membrive.fishindex.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController{
  @GetMapping("/")
    public Map<String, String> home() {
      HashMap<String, String> map = new HashMap<>();
      map.put("message", "Hello, Fishing World!");
      return map;
    }
}
