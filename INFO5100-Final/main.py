from collections import defaultdict

#Question1
def isValid(s):
    d = {")": "(", "}": "{", "]": "["}
    st = []

    for sign in s:
        if st and sign in d:
            if st[-1] == d[sign]:
                st.pop()
            else:
                return False
        else:
            st.append(sign)

    return not st;


#Question2
def compress(old):
    left = 0
    right = 0
    res = ""

    if len(old) <= 1:
        return old

    while right < len(old):
        while old[left] == old[right]:
            right += 1
            if right == len(old):
                break
        res = res + old[left]
        res = res + str(right - left)
        left = right
    if len(res) >= len(old):
        return old
    else:
         return res


#Question3
def lengthOfLongestSubstring(s):
    window = defaultdict(lambda: 0)
    left = 0
    right = 0
    res = 0
    while right < len(s):
        sign = s[right]
        window[sign] += 1
        right += 1

        while window[sign] > 1:
            window[s[left]] -= 1
            left += 1

        res = max(res, right - left)
    return res


#Question4
def sumZero(n):
    res = []
    for i in range(1 - n, n, 2):
        res.append(i)
    return res


#Question5
def findKthLargest(nums, k):
    if len(nums) < k: return 0
    nums.sort()
    return nums[len(nums) - k]



if __name__ == "__main__":
#Question1
    print("===============")
    s = "(]"
    s1 = "()[]{}"
    q1 = isValid(s)
    q11 = isValid(s1)
    print("Question1: ")
    print(q1)
    print("Question1: ")
    print(q11)
    print("===============")

#Question2
    s = "aabcccccaaa"
    s1 = "ab"
    q2 = compress(s)
    q21 = compress(s1)
    print("Qustion2: "+ q2)
    print("Qustion2: "+ q21)


    print("===============")

#Question3
    s = "pwwkew"
    s1 = "bbbb"
    q3 = lengthOfLongestSubstring(s)
    q31 = lengthOfLongestSubstring(s1)
    print("Question3: ")
    print(q3)
    print("Question3: ")
    print(q31)
    print("===============")

#Question4
    n = 5
    n1 = 3
    q4 = sumZero(5)
    q41 = sumZero(3)
    print("Question4: ")
    print(q4)
    print("Question4: ")
    print(q41)
    print("===============")


#Question5
    nums = [3,2,3,1,2,4,5,5,6]
    k = 4
    nums1 =[3,2,1,5,6,4]
    k1 = 2
    q5 = findKthLargest(nums,k)
    q51 = findKthLargest(nums1,k1)
    print("question5: ")
    print(q5)
    print("question5: ")
    print(q51)
    print("===============")







