# Welcome to Shadow Root DOM Framework!!! 🧐

## Purpose this project 🤯
Shadow Root DOM objects are just like an invisible objects in the HTML DOM. Their complexity increases the flexibility of automation using selenium. The objects in Shadow DOM will/can have same id and all other properties also mostly same. Code reusability and usage of DOM objects is quite common.

## Solution to above problem 🤔
I created a Jar, which solves all your problems. Just follow the instructions as specified below. This solution approach is very easy and as simple as traditional selenium/testNG/Cucumber or any other combinations. This framework is adaptive in nature, which means you can alter/enhance/modify for your further needs.


# ###Demo### 😎

<p align="center">
<a href="https://www.linkedin.com/company/sspart"><img align="center" src="http://sspart.org/wp-content/uploads/2019/12/ExcelReporting_Thumbnail.png" width="580"></a>
</p>


## Instructions to use this project 👍
- Create a Class for each Shadow DOM Object
- Shadow DOM Class should extend **'ShadowWebPage'** Class from **'com.ramSabhanam.extendedShadowDOM'** package
- Each Shadow DOM should have a **Constructor** and a method **initiateRoute**

```
public void initiateRoute() {
	try {
			//expandParentRoot(parameter);
			//expandRoot(parameter);
	}catch(Exception ignore) { }
}

```

- If your Shadow Root Object is the first node in HTML **Body**, then use **expandRoot** or else **expandParentRoot**
- Both of this methods takes parameters as **By** or a **Key** in .loc file
- In .loc file, mention the parent object(DOM) hierarchy in terms of parent class like below. Which internally means DownloadToolsBarShadow is in DownloadsManagerShadow
- Sample screenshot of **downloads-manager** and **downloads-toolbar** in HTML Body

```
com.ramSabhanam.shadows.DownloadToolsBarShadow=com.ramSabhanam.shadows.DownloadsManagerShadow
```

## Similar Projects 😉
<p align="center">
<a href="https://github.com/sabhanam/excelReport">Post Batch Excel Reporting</a>
</p>

<p align="center">
<a href="https://github.com/sabhanam/bookmyshow">Book My Show (Movie Ticket) booking Automation</a>
</p>

<p align="center">
<a href="https://github.com/sabhanam/whatsapp">WhatsApp Automation</a>
</p>


## Connect with me 🤝

<p align="center">
<a href="https://www.facebook.com/SSPART.ORG/"><img src="http://sspart.org/wp-content/uploads/2019/11/Facebook_Circle.png" width="48"></a><span style="padding-left:10px;"/>
<a href="https://www.instagram.com/sspart_org/"><img src="http://sspart.org/wp-content/uploads/2019/11/Instagram_Circle.png" width="48"></a><span style="padding-left:10px;"/>
<a href="mailto:contact@sspart.org"><img src="http://sspart.org/wp-content/uploads/2019/11/Mail_Circle.png" width="48"></a><span style="padding-left:10px;"/>
<a href="https://www.youtube.com/channel/UCyNXuAWqDjMIoSXj5I1NqaA"><img src="http://sspart.org/wp-content/uploads/2019/11/YouTube_Circle.png" width="48"></a><span style="padding-left:10px;"/>
<a href="https://wa.me/919515093965"><img src="http://sspart.org/wp-content/uploads/2019/11/WhatsApp_Circle.png" width="48"></a><span style="padding-left:10px;"/>
<a href="https://github.com/sabhanam"><img src="http://sspart.org/wp-content/uploads/2019/11/GitHub_Circle.png" width="48"></a><span style="padding-left:10px;"/>
<a href="http://sspart.org/"><img src="http://sspart.org/wp-content/uploads/2019/11/WebSite_Circle.png" width="48"></a><span style="padding-left:10px;"/>
<a href="https://www.linkedin.com/in/ram-sabhanam/"><img src="http://sspart.org/wp-content/uploads/2019/11/LinkedIn_Circle-e1574599074500.png" width="48"></a>
</p>