<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>고객센터</title>
    <link rel="stylesheet" type="text/css" href="../css/support.css">
</head>
<body>
    <div class="faq-container">
        <div class="faq-title">자주 묻는 질문(FAQ)</div>

        <div class="faq-item">
            <div class="faq-question">Q1. 상품을 여러 개 구매했는데, 일부 수량 부분 교환/반품하고 싶어요.</div>
            <div class="faq-answer">A1. 비밀번호 찾기 기능을 사용하여 새로운 비밀번호를 설정할 수 있습니다.</div>
        </div>

        <div class="faq-item">
            <div class="faq-question">Q2. 주문 취소는 어떻게 하나요?</div>
            <div class="faq-answer">A2. 주문 내역에서 취소 버튼을 눌러 취소 신청을 하실 수 있습니다.</div>
        </div>

        <div class="faq-item">
            <div class="faq-question">Q3. 배송은 얼마나 걸리나요?</div>
            <div class="faq-answer">A3. 일반적으로 배송은 2-3일 정도 소요됩니다.</div>
        </div>

        <!-- 더 많은 FAQ 항목을 추가할 수 있습니다 -->
    </div>

    <script type="text/javascript">
        document.querySelectorAll('.faq-question').forEach(function(item) {
            item.addEventListener('click', function() {
                var parent = item.parentElement;
                parent.classList.toggle('active');
            });
        });
    </script>
</body>
</html>
