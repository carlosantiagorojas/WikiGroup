# Project Title

A brief description of what this project does and who it's for

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

## Authors

- [@alejandronoss1017](https://github.com/alejandronoss1017)
- [@carlosantiagorojas](https://github.com/carlosantiagorojas)
- [@StiivenOrtiz](https://github.com/StiivenOrtiz)
- [@GianlucaGav](https://github.com/GianlucaGav)

