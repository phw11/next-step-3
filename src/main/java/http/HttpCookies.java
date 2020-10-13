package http;

import java.util.HashMap;
import java.util.Map;

public class HttpCookies {

  private String path;
  private Map<String, String> cookie = new HashMap<>();

  public HttpCookies() {}

  public HttpCookies(Map<String, String> cookie) {
    this.cookie = cookie;
  }

  public HttpCookies addCookie(String key, String value) {
    cookie.put(key, value);
    return this;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();

    for (Map.Entry<String, String> entry : cookie.entrySet()) {
      builder.append(String.format("%s=%s;", entry.getKey(), entry.getValue()));
    }

    builder.append("Path=").append(path);

    return builder.toString();
  }
}
