<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<link rel="stylesheet" type="text/css" href="../css/mypage.css">
</head>
<body>
    <div class="mypage-container">
        <!-- 왼쪽 메뉴 -->
        <nav class="menu">
            <ul>
                <li><a href="/mypage/profile.html" class="active-menu" onclick="showContent('profile')">내 정보</a></li>
                <li><a href="/mypage/orders.html" onclick="showContent('orders')">주문 내역</a></li>
                <li><a href="/mypage/returns.html" onclick="showContent('returns')">취소/반품 내역</a></li>
                <li><a href="/mypage/support.html" onclick="showContent('support')">고객센터</a></li>
                <li><a href="/mypage/product-inquiry.html" onclick="showContent('product-inquiry')">상품 문의 내역</a></li>
                <li><a href="/mypage/notice.html" onclick="showContent('notices')">공지사항</a></li>
            </ul>
        </nav>

        <!-- 오른쪽 내용 영역 -->
        <div class="content">
            <!-- 콘텐츠가 동적으로 로드됩니다 -->
            <jsp:include page="${CONTENT}" />
        </div>
    </div>

    <script type="text/javascript">
 // 콘텐츠를 변경하는 함수
    function showContent(contentId) {
        // 모든 메뉴 링크에서 active-menu 클래스 제거
        var menuItems = document.querySelectorAll('nav.menu li a');
        menuItems.forEach(function(item) {
            item.classList.remove('active-menu');
        });

        // 클릭된 메뉴에 active-menu 클래스 추가
        var activeMenu = document.querySelector('a[href="/mypage/' + contentId + '"]');
        activeMenu.classList.add('active-menu');

        // AJAX 방식으로 동적으로 콘텐츠를 업데이트
        fetch("/mypage/" + contentId)
            .then(response => response.text())
            .then(data => {
                document.querySelector('.content').innerHTML = data; // 콘텐츠를 업데이트
            })
            .catch(error => console.error('Error fetching content:', error));
    }

    // 페이지 로드 시 '내 정보' 콘텐츠 활성화
    window.onload = function() {
        showContent('profile');  // '내 정보' 콘텐츠 활성화
    };

    </script>
</body>
</html>
