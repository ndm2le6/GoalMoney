# GoalMoney v2.0 Stable

Android native Java, không Flutter, không WebView, không thư viện giao diện ngoài.

## Chức năng
- Ví Tổng = Ví Tiêu Dùng + tiền trong mục tiêu.
- Thêm, sửa, xóa mục tiêu; loại mục tiêu và ngày hoàn thành.
- Tự tính phần trăm, số ngày còn lại và số tiền cần dành mỗi ngày.
- Thu, chi, chuyển vào mục tiêu, rút khỏi mục tiêu.
- Chọn ngày và giờ thủ công.
- Danh mục: lương, thưởng, mua sắm, trả nợ, ăn uống, di chuyển, nhà ở, sức khỏe, học tập, giải trí.
- Sửa và xóa giao dịch; số dư được hoàn tác/tính lại.
- Lịch sử toàn bộ, Ví Tiêu Dùng hoặc từng mục tiêu.
- Lọc 7 ngày, 30 ngày, từ đầu và khoảng ngày tự chọn.
- Biểu đồ Thu/Chi theo ngày, tháng, năm.
- Biểu đồ phân bổ mục tiêu và lịch sử tài sản 7 ngày.
- Widget màn hình chính có Ví Tổng, Thu nhanh và Chi nhanh.
- Sao lưu/khôi phục JSON, xuất CSV trong Phân tích → ⋮.
- Tự đọc dữ liệu cũ của bản v1.x khi nâng cấp.

## Build trên GitHub
Push toàn bộ project lên nhánh `main`. Workflow **Build GoalMoney v2.0 Stable APK** sẽ chạy.
Artifact: `GoalMoney-v2.0-Stable-APK`.

## Cập nhật repo hiện tại bằng Termux
```bash
cp -r /storage/emulated/0/Download/GoalMoney-v2.0-Stable/. /DUONG_DAN_REPO_CUA_BAN/
cd /DUONG_DAN_REPO_CUA_BAN
git config --global --add safe.directory "$(pwd)"
git add -A
git commit -m "GoalMoney v2.0 Stable"
git push
```
