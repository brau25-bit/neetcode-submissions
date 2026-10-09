class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s: string, t: string): boolean {
        if(s.length !== t.length) return false;

        const seenS: Map<string, number> = new Map<string, number>();
        const seenT: Map<string, number> = new Map<string, number>();

        for(let i = 0; i < t.length; i++){
            seenS.set(s[i], (seenS.get(s[i]) || 0) + 1);
            seenT.set(t[i], (seenT.get(t[i]) || 0) + 1);
        }

        for(let i = 0; i < t.length; i++){
            let totalS = seenS.get(s[i]);
            let totalT = seenT.get(s[i]);

            if(totalS !== totalT) return false;
        }

        return true;
    }
}
