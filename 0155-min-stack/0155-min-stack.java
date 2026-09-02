class MinStack {
    class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    Stack<Pair> st = new Stack<>();

    public MinStack() {

    }

    public void push(int value) {
        if (st.isEmpty()) {
            st.push(new Pair(value, value));
        } else {
            Pair p = st.peek();
            st.push(new Pair(value, Math.min(p.second, value)));
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            st.pop();
            return;
        }
    }

    public int top() {
        if (st.isEmpty()) {
            return -1;
        }
        Pair p = st.peek();
        return p.first;
    }

    public int getMin() {
        if (st.isEmpty()) {
            return -1;
        }
        Pair p = st.peek();
        return p.second;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */