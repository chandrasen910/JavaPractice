#Given an array of strings strs, group the anagrams together. You can return the answer in any order.

#An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
       res =  defaultdict(list)#mapping charCount to list of anagrams
       for word in strs:
           count = [0] *26
           for c in s:
               count[ord(c)-ord("a")] +=1  # We are getting the ascii value 

           res[tuple(count)].append(s)
           
        return res.values()
