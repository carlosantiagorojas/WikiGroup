# Project Title

A brief description of what this project does and who it's for

## Index page

By default, Spring Boot will map the root context (‘/’) to /static/index.html. The index.html resource is special because, if it exists, it is used as a "welcome page". It will be served up if the user browses to the root path of the application. If no index.html is found, it falls back to the static index page built into Spring Boot. This page displays a simple message to the user.

## Imports of css,images and scripts using spring boot

By default, Spring Boot serves static content from a directory called /static (or /public or /resources or /META-INF/resources) in the classpath or from the root of the ServletContext. It uses the ResourceHttpRequestHandler from Spring MVC so you can modify that behavior by adding your own WebMvcConfigurerAdapter and overriding the addResourceHandlers method.

So for imports of css, images and scripts you can use the following structure:

```html
<!-- Links to styles -->
<link rel="stylesheet" href="styles/normalize.css" />
<link rel="stylesheet" href="styles/common/header.css" />
<link rel="stylesheet" href="styles/common/footer.css" />
<link rel="stylesheet" href="styles/common/button.css" />
<link rel="stylesheet" href="styles/common/pair.css" />
<link rel="stylesheet" href="styles/home-page.css" />
```

Same happens with the anchor tag `<a>` and their href attribute, you can use the following structure:

```html
<div class="header__container">
  <div class="name__logo__container">
    <div class="logo"></div>
    <a href="/">
      <h1>Yordles</h1>
    </a>
  </div>
  <nav class="navBar">
    <a href="/about-us">Nosotros</a>
    <a href="/project">Proyecto</a>
    <a href="/contact-us">Contáctanos</a>
  </nav>
</div>
```

The href attribute is the path to the page you want to go, mapped in the controller.

```java
@Controller
@RequestMapping("/about-us")
public class AboutUsController {

	/*
	 * The @GetMapping annotation tells Spring that
     * this method will handle all GET requests
     * that come in at the /about-us path.
	 */
	@GetMapping()
	public String aboutUsPage() {
		return "about-us";
	}

}
```

## Authors

- [@alejandronoss1017](https://github.com/alejandronoss1017)
- [@carlosantiagorojas](https://github.com/carlosantiagorojas)
- [@StiivenOrtiz](https://github.com/StiivenOrtiz)
- [@GianlucaGav](https://github.com/GianlucaGav)
